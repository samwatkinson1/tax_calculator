package tax;

import java.time.LocalDate;

public class DefaultTaxCalculator extends TaxCalculator {
    public Emissions emissionsCalculator  = new Emissions();
    @Override
    int calculateTax(Vehicle vehicle) {
        FuelType vehicleFuelType = vehicle.getFuelType();
        LocalDate vehicleRegDate = vehicle.getDateOfFirstRegistration();

        if (getYear() == vehicleRegDate.getYear()) {
            return getFirstYearTax(vehicle, vehicleFuelType);
        } else {
            return getSubsequentTax(vehicle, vehicleFuelType);
        }
    }

    private int getFirstYearTax(Vehicle vehicle, FuelType fuelType) {
        int vehicleCo2Emissions = vehicle.getCo2Emissions();
        switch (fuelType) {
            case PETROL:
                vehicleCo2Emissions = emissionsCalculator.petrolCo2Calculator(vehicleCo2Emissions);
                break;
            case DIESEL:
                vehicleCo2Emissions = emissionsCalculator.dieselCo2Calculator(vehicleCo2Emissions);
                break;
            case ALTERNATIVE_FUEL:
                vehicleCo2Emissions = emissionsCalculator.alternateCo2Calculator(vehicleCo2Emissions);
                break;
            default:
                vehicleCo2Emissions = 0;
        }
        return vehicleCo2Emissions;
    }

    private int getSubsequentTax(Vehicle vehicle, FuelType fuelType) {
        int cost = 0;
        switch (fuelType) {
            case PETROL:
            case DIESEL:
                cost = 140;
                break;
            case ALTERNATIVE_FUEL:
                cost = 130;
                break;
        }
        return cost;
    }



}


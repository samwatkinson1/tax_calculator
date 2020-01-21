package tax;

import java.time.LocalDate;

public class DefaultTaxCalculator extends TaxCalculator {
    private Emissions emissionsCalculator = new Emissions();
    private FeatureToggle features;
    private boolean afterFirstYearToggle;
    private boolean expensiveVehicleToggle;

    DefaultTaxCalculator(boolean AFTER_YEAR, boolean EXPENSIVE_VEHICLE){
        this.afterFirstYearToggle = true;
        this.expensiveVehicleToggle = true;
    }

    DefaultTaxCalculator(FeatureToggle features) {
        this.features = features;
    }

    @Override
    int calculateTax(Vehicle vehicle) {
        int vehicleCo2Emissions = vehicle.getCo2Emissions();
        FuelType vehicleFuelType = vehicle.getFuelType();
        LocalDate vehicleDateOfFirstReg = vehicle.getDateOfFirstRegistration();
        int cost = 0;


        if (vehicleDateOfFirstReg.getYear() == getYear()-1) {
            cost = CO2Range.getCO2Range(vehicleCo2Emissions).getPriceForCO2FromFuelType(vehicleFuelType);
        }else{
            if (vehicle.getListPrice() > 40000) {
                if (vehicle.getFuelType().equals(FuelType.PETROL) || vehicle.getFuelType().equals(FuelType.DIESEL)) {
                    cost = 450;
                } else if (vehicle.getFuelType().equals(FuelType.ELECTRIC)) {
                    cost = 310;
                } else if (vehicle.getFuelType().equals(FuelType.ALTERNATIVE_FUEL)) {
                    cost =  440;
                }
            }else {
                cost = subsequentYearTax(vehicleFuelType, vehicleCo2Emissions);
            }
        }
        return cost;
    }

    private int firstYearTax(FuelType vehicleFuelType, int vehicleCo2Emissions) {
        int result;
        switch (vehicleFuelType) {
            case PETROL:
                result = emissionsCalculator.petrolCo2Calc(vehicleCo2Emissions);
                break;
            case DIESEL:
                result = emissionsCalculator.dieselCo2Calc(vehicleCo2Emissions);
                break;
            case ALTERNATIVE_FUEL:
            case ELECTRIC:
                result = emissionsCalculator.alternateCo2Calc(vehicleCo2Emissions);
                break;
            default:
                result = Integer.MAX_VALUE;
                break;
        }
        return result;

    }

    private int subsequentYearTax(FuelType vehicleFuelType, int vehicleCo2Emissions) {
        int result;
        switch (vehicleFuelType) {
            case PETROL:
            case DIESEL:
                result = 140;
                break;
            case ALTERNATIVE_FUEL:
                result = 130;
                break;
            case ELECTRIC:
                result = 0;
                break;
            default:
                result = Integer.MAX_VALUE;
                break;
        }
        return result;

    }


}


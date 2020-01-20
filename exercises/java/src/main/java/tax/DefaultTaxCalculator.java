package tax;

public class DefaultTaxCalculator extends TaxCalculator{

    @Override
    int calculateTax(Vehicle vehicle) {
        int vehicleCo2Emissions = vehicle.getCo2Emissions();
        FuelType vehicleFuelType = vehicle.getFuelType();

        if (vehicleFuelType != FuelType.PETROL) {
            return 9999;
        } else {
            if(vehicleCo2Emissions > 255) {
                return 2070;
            } else if(vehicleCo2Emissions >= 226) {
                return 1760;
            } else if(vehicleCo2Emissions >= 191) {
                return 1240;
            } else if(vehicleCo2Emissions >= 171) {
                return 830;
            } else if(vehicleCo2Emissions >= 151) {
                return 515;
            } else if(vehicleCo2Emissions >= 131) {
                return 205;
            } else if(vehicleCo2Emissions >= 111) {
                return 165;
            } else if(vehicleCo2Emissions >= 101) {
                return 145;
            } else if(vehicleCo2Emissions >= 91) {
                return 125;
            } else if(vehicleCo2Emissions >= 76) {
                return 105;
            } else if(vehicleCo2Emissions >= 51) {
                return 25;
            } else if(vehicleCo2Emissions >= 1) {
                return 10;
            } else{
                return 0;
            }
        }
    }
}


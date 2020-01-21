package tax;

public class Emissions {
    int petrolCo2Calc(int vehicleCo2Emissions) {
        int cost = 0;

        if (vehicleCo2Emissions > 255) {
            cost = 2070;
        } else if (vehicleCo2Emissions >= 226) {
            cost = 1760;
        } else if (vehicleCo2Emissions >= 191) {
            cost = 1240;
        } else if (vehicleCo2Emissions >= 171) {
            cost = 830;
        } else if (vehicleCo2Emissions >= 151) {
            cost = 515;
        } else if (vehicleCo2Emissions >= 131) {
            cost = 205;
        } else if (vehicleCo2Emissions >= 111) {
            cost = 165;
        } else if (vehicleCo2Emissions >= 101) {
            cost = 145;
        } else if (vehicleCo2Emissions >= 91) {
            cost = 125;
        } else if (vehicleCo2Emissions >= 76) {
            cost = 105;
        } else if (vehicleCo2Emissions >= 51) {
            cost = 25;
        } else if (vehicleCo2Emissions >= 1) {
            cost = 10;
        }

        return cost;
    }

    int dieselCo2Calc(int vehicleCo2Emissions) {
        int cost = 0;

        if (vehicleCo2Emissions > 255) {
            cost = 2070;
        } else if (vehicleCo2Emissions >= 226) {
            cost = 2070;
        } else if (vehicleCo2Emissions >= 191) {
            cost = 1760;
        } else if (vehicleCo2Emissions >= 171) {
            cost = 1240;
        } else if (vehicleCo2Emissions >= 151) {
            cost = 830;
        } else if (vehicleCo2Emissions >= 131) {
            cost = 515;
        } else if (vehicleCo2Emissions >= 111) {
            cost = 205;
        } else if (vehicleCo2Emissions >= 101) {
            cost = 165;
        } else if (vehicleCo2Emissions >= 91) {
            cost = 145;
        } else if (vehicleCo2Emissions >= 76) {
            cost = 125;
        } else if (vehicleCo2Emissions >= 51) {
            cost = 105;
        } else if (vehicleCo2Emissions >= 1) {
            cost = 25;
        }

        return cost;
    }

    int alternateCo2Calc(int vehicleCo2Emissions) {
        int cost = 0;

        if (vehicleCo2Emissions > 255) {
            cost = 2060;
        } else if (vehicleCo2Emissions >= 226) {
            cost = 1750;
        } else if (vehicleCo2Emissions >= 191) {
            cost = 1230;
        } else if (vehicleCo2Emissions >= 171) {
            cost = 820;
        } else if (vehicleCo2Emissions >= 151) {
            cost = 505;
        } else if (vehicleCo2Emissions >= 131) {
            cost = 195;
        } else if (vehicleCo2Emissions >= 111) {
            cost = 155;
        } else if (vehicleCo2Emissions >= 101) {
            cost = 135;
        } else if (vehicleCo2Emissions >= 91) {
            cost = 115;
        } else if (vehicleCo2Emissions >= 76) {
            cost = 95;
        } else if (vehicleCo2Emissions >= 51) {
            cost = 15;
        }

        return cost;
    }
}

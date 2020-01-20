package tax;

class Emissions {
    int petrolCo2Calculator(int co2) {
        int cost = 0;
        if (co2 > 255) {
            cost = 2070;
        } else if (co2 >= 226) {
            return 1760;
        } else if (co2 >= 191) {
            cost = 1240;
        } else if (co2 >= 171) {
            cost = 830;
        } else if (co2 >= 151) {
            cost = 515;
        } else if (co2 >= 131) {
            cost = 205;
        } else if (co2 >= 111) {
            cost = 165;
        } else if (co2 >= 101) {
            cost = 145;
        } else if (co2 >= 91) {
            cost = 125;
        } else if (co2 >= 76) {
            cost = 105;
        } else if (co2 >= 51) {
            cost = 25;
        } else if (co2 >= 1) {
            cost = 10;
        }
        return cost;
    }

    int dieselCo2Calculator(int co2) {
        if (co2 >= 226) {
            return 2070;
        } else if (co2 >= 191) {
            return 1760;
        } else if (co2 >= 171) {
            return 1240;
        } else if (co2 >= 151) {
            return 830;
        } else if (co2 >= 131) {
            return 515;
        } else if (co2 >= 111) {
            return 205;
        } else if (co2 >= 101) {
            return 165;
        } else if (co2 >= 91) {
            return 145;
        } else if (co2 >= 76) {
            return 125;
        } else if (co2 >= 51) {
            return 105;
        } else if (co2 >= 1) {
            return 25;
        } else {
            return 0;
        }
    }

    int alternateCo2Calculator(int co2) {
        if (co2 > 255) {
            return 2060;
        } else if (co2 >= 226) {
            return 1750;
        } else if (co2 >= 191) {
            return 1230;
        } else if (co2 >= 171) {
            return 820;
        } else if (co2 >= 151) {
            return 505;
        } else if (co2 >= 131) {
            return 195;
        } else if (co2 >= 111) {
            return 155;
        } else if (co2 >= 101) {
            return 135;
        } else if (co2 >= 91) {
            return 115;
        } else if (co2 >= 76) {
            return 95;
        } else if (co2 >= 51) {
            return 15;
        } else {
            return 0;
        }
    }
}

package tax;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public enum CO2Range {

    ZERO(0, 0, 0),
    ONE_TO_FIFTY(10,25,0),
    FIFTY_ONE_TO_SEVENTY_FIVE(25, 105, 15),
    SEVENTY_SIX_TO_NINETY(105, 125, 95),
    NINETY_ONE_TO_ONE_HUNDRED(125, 145, 115),
    ONE_HUNDRED_ONE_TO_ONE_HUNDRED_TEN(145, 165, 135),
    ONE_HUNDRED_ELEVEN_TO_ONE_HUNDRED_THIRTY(165, 205, 155),
    ONE_HUNDRED_THIRTY_ONE_TO_ONE_HUNDRED_FIFTY(205, 515, 195),
    ONE_HUNDRED_FIFTY_ONE_TO_ONE_HUNDRED_SEVENTY(515, 830, 505),
    ONE_HUNDRED_SEVENTY_ONE_TO_ONE_HUNDRED_NINETY(830, 1240, 820),
    ONE_HUNDRED_NINETY_ONE_TO_TWO_HUNDRED_TWENTY_FIVE(1240, 1760, 1230),
    TWO_HUNDRED_TWENTY_SIX_TO_TWO_HUNDRED_FIFTY_FIVE(1760, 2070, 1750),
    OVER_TWO_HUNDRED_FIFTY_FIVE(2070, 2070, 2060);

    private int priceForPetrol;
    private int priceForDiesel;
    private int priceForAlternate;

    private static Map<Range, CO2Range> allRanges = new HashMap<>(){{
        put(Range.values(0,0), ZERO);
        put(Range.values(1,50), ONE_TO_FIFTY);
        put(Range.values(51,75), FIFTY_ONE_TO_SEVENTY_FIVE);
        put(Range.values(76,90), SEVENTY_SIX_TO_NINETY);
        put(Range.values(91,100), NINETY_ONE_TO_ONE_HUNDRED);
        put(Range.values(101,110), ONE_HUNDRED_ONE_TO_ONE_HUNDRED_TEN);
        put(Range.values(111,130), ONE_HUNDRED_ELEVEN_TO_ONE_HUNDRED_THIRTY);
        put(Range.values(151,170), ONE_HUNDRED_FIFTY_ONE_TO_ONE_HUNDRED_SEVENTY);
        put(Range.values(171,190), ONE_HUNDRED_SEVENTY_ONE_TO_ONE_HUNDRED_NINETY);
        put(Range.values(191,225), ONE_HUNDRED_NINETY_ONE_TO_TWO_HUNDRED_TWENTY_FIVE);
        put(Range.values(256,Integer.MAX_VALUE), OVER_TWO_HUNDRED_FIFTY_FIVE);

    }};

    CO2Range(int priceForPetrol, int priceForDiesel, int priceForAlternate) {
        this.priceForPetrol = priceForPetrol;
        this.priceForDiesel = priceForDiesel;
        this.priceForAlternate = priceForAlternate;
    }

    public static CO2Range getCO2Range(int co2Range) {

        allRanges.entrySet()
                .stream()
                .filter(e -> e.getKey().isInbetween(co2Range));

        if (co2Range <= 0) {
            return ZERO;
        }else if (co2Range <= 50) {
            return ONE_TO_FIFTY;
        }if (co2Range <= 75) {
            return FIFTY_ONE_TO_SEVENTY_FIVE;
        }if (co2Range <= 90) {
            return SEVENTY_SIX_TO_NINETY;
        }if (co2Range <= 100) {
            return NINETY_ONE_TO_ONE_HUNDRED;
        }if (co2Range <= 110) {
            return ONE_HUNDRED_ONE_TO_ONE_HUNDRED_TEN;
        }if (co2Range <= 130) {
            return ONE_HUNDRED_ELEVEN_TO_ONE_HUNDRED_THIRTY;
        }if (co2Range <= 150) {
            return ONE_HUNDRED_THIRTY_ONE_TO_ONE_HUNDRED_FIFTY;
        }if (co2Range <= 170) {
            return ONE_HUNDRED_FIFTY_ONE_TO_ONE_HUNDRED_SEVENTY;
        }if (co2Range <= 190) {
            return ONE_HUNDRED_SEVENTY_ONE_TO_ONE_HUNDRED_NINETY;
        }if (co2Range <= 225) {
            return ONE_HUNDRED_NINETY_ONE_TO_TWO_HUNDRED_TWENTY_FIVE;
        }if (co2Range <= 255) {
            return TWO_HUNDRED_TWENTY_SIX_TO_TWO_HUNDRED_FIFTY_FIVE;
        }else{
            return OVER_TWO_HUNDRED_FIFTY_FIVE;
        }
    }

    public int getPriceForCO2FromFuelType(FuelType fuelType) {
        switch (fuelType) {
            case PETROL:
                return priceForPetrol;
            case DIESEL:
                return priceForDiesel;
            case ALTERNATIVE_FUEL:
                return priceForAlternate;
            case ELECTRIC:
            default: return 0;
        }
    }
}
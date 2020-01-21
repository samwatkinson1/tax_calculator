package tax;
    
public class FeatureToggle {

    private final boolean EXPENSIVE_VEHICLE;
    private final boolean FIRST_YEAR;
    private final boolean FEATURE_3;
    private final boolean FEATURE_4;
    private final boolean FEATURE_5;
    private final boolean FEATURE_6;
    private final boolean FEATURE_7;
    private final boolean FEATURE_8;
    private final boolean FEATURE_9;
    private final boolean FEATURE_10;

    public FeatureToggle(boolean EXPENSIVE_VEHICLE, boolean FIRST_YEAR, boolean FEATURE_3, boolean FEATURE_4, boolean FEATURE_5, boolean FEATURE_6, boolean FEATURE_7, boolean FEATURE_8, boolean FEATURE_9, boolean FEATURE_10) {
        this.EXPENSIVE_VEHICLE = EXPENSIVE_VEHICLE;
        this.FIRST_YEAR = FIRST_YEAR;
        this.FEATURE_3 = FEATURE_3;
        this.FEATURE_4 = FEATURE_4;
        this.FEATURE_5 = FEATURE_5;
        this.FEATURE_6 = FEATURE_6;
        this.FEATURE_7 = FEATURE_7;
        this.FEATURE_8 = FEATURE_8;
        this.FEATURE_9 = FEATURE_9;
        this.FEATURE_10 = FEATURE_10;
    }

    public boolean isEXPENSIVE_VEHICLE() {
        return EXPENSIVE_VEHICLE;
    }

    public boolean isFIRST_YEAR() {
        return FIRST_YEAR;
    }

    public static class Builder {

        private boolean EXPENSIVE_VEHICLE = false;
        private boolean FIRST_YEAR = false;
        private boolean FEATURE_3 = false;
        private boolean FEATURE_4 = false;
        private boolean FEATURE_5 = false;
        private boolean FEATURE_6 = false;
        private boolean FEATURE_7 = false;
        private boolean FEATURE_8 = false;
        private boolean FEATURE_9 = false;
        private boolean FEATURE_10 = false;

        public Builder isExpensiveVehicle(Boolean toggle) {
            EXPENSIVE_VEHICLE = toggle;
            return this;
        }
        public Builder isFirstYear(Boolean toggle) {
            FIRST_YEAR = toggle;
            return this;
        }
        public Builder isFeature3(Boolean toggle) {
            FEATURE_3 = toggle;
            return this;
        }
        public Builder isFeature4(Boolean toggle) {
            FEATURE_4 = toggle;
            return this;
        }
        public Builder isFeature5(Boolean toggle) {
            FEATURE_5 = toggle;
            return this;
        }
        public Builder isFeature6(Boolean toggle) {
            FEATURE_6 = toggle;
            return this;
        }
        public Builder isFeature7(Boolean toggle) {
            FEATURE_7 = toggle;
            return this;
        }
        public Builder isFeature8(Boolean toggle) {
            FEATURE_8 = toggle;
            return this;
        }
        public Builder isFeature9(Boolean toggle) {
            FEATURE_9 = toggle;
            return this;
        }
        public Builder isFeature10(Boolean toggle) {
            FEATURE_10 = toggle;
            return this;
        }

        public FeatureToggle build() {
            return new FeatureToggle(EXPENSIVE_VEHICLE,
                    FIRST_YEAR,
                    FEATURE_3,
                    FEATURE_4,
                    FEATURE_5,
                    FEATURE_6,
                    FEATURE_7,
                    FEATURE_8,
                    FEATURE_9,
                    FEATURE_10);
        }

    }
}

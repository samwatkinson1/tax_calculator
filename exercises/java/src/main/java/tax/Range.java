package tax;

public class Range {

    int start;
    int end;

    private Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public static Range values(int start, int end){
        return new Range(start, end);
    }

    boolean isInbetween(int num){
        return (num >=start && num <= end);
    }

}

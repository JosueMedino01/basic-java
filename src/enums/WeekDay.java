package enums;

public enum WeekDay {
    MONDAY(1), TUESDAY(2),WEDNESDAT(3), 
    THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    WeekDay(int value){
        this.value = value;
    }
}

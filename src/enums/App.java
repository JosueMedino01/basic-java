package enums;
public class App {
    public static void main(String[] args) throws Exception {
        /* Enums */
        for(WeekDay day: WeekDay.values()){
            System.out.println(day);
        }

        WeekDay anyDay = WeekDay.valueOf("MONDAY");
        System.out.println("Enums using valueOf(): " + anyDay);
        System.out.println("Enums using getValue(): " + anyDay.getValue());
    }
}

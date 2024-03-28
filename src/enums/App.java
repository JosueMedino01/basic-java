package enums;

public class App {
    public static void main(String[] args) throws Exception {
        /* Enums */
        System.out.println("Values() and ValueOf()\n");
        
        for(WeekDay day: WeekDay.values()){
            System.out.println(day);
        }

        WeekDay anyDay = WeekDay.valueOf("MONDAY");
        System.out.println("Enums using valueOf(): " + anyDay);
        System.out.println("Enums using getValue(): " + anyDay.getValue());

        System.out.println("\n\nAbstract Method\n");
        for(AbstractMethods operator : AbstractMethods.values()){
            System.out.println(operator + " (" + operator.getOperator() + ")");
        }

        System.out.println();
        double sum;

        sum =  AbstractMethods.SUM.calc(2, 5);
        System.out.println("AbstractMethods.SUM.calc(2, 5) = " + sum);

        sum = AbstractMethods.valueOf("SUM").calc(20, 30);
        System.out.println("AbstractMethods.valueOf(\"+\").calc(20, 30); = " + sum);
    }
    
}

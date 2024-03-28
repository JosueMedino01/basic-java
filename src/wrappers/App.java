package wrappers;

public class App {
    public static void main(String[] args) throws Exception{
        Integer intNum = Integer.valueOf(1);
        Double doubNum = Double.valueOf(2000);
        Long longNum = Long.valueOf(30000l);
        Float floatNum = Float.valueOf(222f);
        Short shortNum = Short.valueOf("24");
        Boolean boolValue = Boolean.valueOf("true");
        Character charValue = Character.valueOf('F');

        
        System.out.println(intNum);
        System.out.println(doubNum);
        System.out.println(longNum);
        System.out.println(floatNum);
        System.out.println(shortNum);
        System.out.println(boolValue);
        System.out.println(charValue);

        /* Methods */
        System.out.println(floatNum.intValue());


        /* autoboxing */
        Short numShor01 = 1; //Short.valueOf(1);

        /* autoboxing in expression */
        numShor01++;

        /* auto un-boxing */
        short numUnboxing = numShor01;


    }
}

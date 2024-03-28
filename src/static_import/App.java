package static_import;
import static java.lang.Math.*;
public class App {
    public static void main(String[] args) {
        /* if you need use a library much times? */
        double value = sqrt(100); /* Math.sqrt(100) */
        System.out.println("the value is: " + value);
    }
}

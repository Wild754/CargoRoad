package Car;
import java.util.Date;

public interface Time { // Interface segregation principle
    class DateTimeFixer {
        public static Date fixDateTime() {
            Date currentDateTime = new Date();
            return currentDateTime;
        }

        public static void SetTime() {
            Date fixedDateTime = fixDateTime();
            System.out.println("Час виїзду:  " + fixedDateTime);
        }
    }
}

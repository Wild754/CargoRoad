package Route;
import Car.Time;
import java.util.Date;
import java.util.concurrent.TimeUnit;



public class DepartTime implements Time { //Interface segregation principle
    public static class TimeCalculator {
        public static double calculateTravelTime(Date startTime, Date endTime) {
            if (endTime.before(startTime)) {
                throw new IllegalArgumentException("The end time cannot be earlier than the start time");
            }

            long travelTimeMillis = endTime.getTime() - startTime.getTime();
            return (double) TimeUnit.MILLISECONDS.toHours(travelTimeMillis);
        }

        public static void ExpectedTime() {
            Date startTime = Time.DateTimeFixer.fixDateTime();
            Date endTime = new Date(startTime.getTime() + 12900000);

            double travelTime = calculateTravelTime(startTime, endTime);

            System.out.println("Час в дорозі: " + travelTime + " годин");
        }
    }
}
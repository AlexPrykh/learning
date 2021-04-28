package week1;

import java.util.Scanner;

/*
    12. Відомі дві швидкості, одна в км за годину, інша в метрах за секунду. Яка з них більша?
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a speed km per hour:");
        int kmPerHour = scanner.nextInt();
        System.out.println("Please, enter a speed meters per second:");
        int metersPerSecond = scanner.nextInt();

        System.out.println("There are two speeds, one in km per hour, the other in meters per second." +
                " Which one is bigger?" + "\n" + kmPerHour + " km/hour" + " or "
                + metersPerSecond + " m/s");

        int kmPerHourInMetersPerSecond = kmPerHour * 1000 / 3600;

        if (kmPerHourInMetersPerSecond > metersPerSecond) {
            System.out.println("Speed km/hour: " + kmPerHour + " > " + " m/s: " + metersPerSecond);
        } else if (kmPerHourInMetersPerSecond == metersPerSecond) {
            System.out.println("Speed km/hour: " + kmPerHour + " equal m/s: " + metersPerSecond);
        } else {
            System.out.println("Speed m/s: " + metersPerSecond + " > " + "km/hour: " + kmPerHour);
        }
    }
}

package week1;

import java.util.Scanner;

/*
    14. Дано швидкість та час. Визначити, за який час ви прибудете в пункт призначення.
 */
public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a speed in km/h:");
        int kmPerHour = sc.nextInt();
        System.out.println("Please, enter a time:");
        int time = sc.nextInt();

        int distance = kmPerHour * time;

        if (kmPerHour * time == distance) {
            System.out.println("You will arrive at your destination via " + time + " hour," +
                    " and overcome the distance " + distance + " km.");
        } else {
            System.out.println("Error! The values are incorrect.");
        }
    }
}

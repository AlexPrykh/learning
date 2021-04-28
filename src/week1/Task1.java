package week1;

import java.util.Scanner;
/*
    1. Користувач вводить параметр з консолі (поточний час від 0 до 24).
    Якщо час від 9 до 18, виводимо "Я на роботі", інакше "Я відпочиваю".
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the current time:");
        int time = sc.nextInt();

        if (time >= 9 && time <= 18) {
            System.out.println("I`m working!");
        } else {
            System.out.println("I`m chilling.");
        }
    }
}

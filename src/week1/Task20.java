package week1;

import java.util.Scanner;

/*
    20. Написати програму, яка в залежності від характеру вітру (в м/c) виводить повідомлення про його
        силу. 1-4 - слабкий, 5-10 - помірний, 9-18 - сильний, більше 19 - ураганний.
 */
public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter wind speed in m/s:");
        int ws = scanner.nextInt();

        if (ws >= 1 && ws <= 4) {
            System.out.println(ws + " - the wind is week.");
        } else if (ws >= 5 && ws <= 9) {
            System.out.println(ws + " - the wind is moderate.");
        } else if (ws >= 10 && ws <= 18) {
            System.out.println(ws + " - strong wind. Be careful.");
        } else if (ws >= 19) {
            System.out.println(ws + " - hurricane wind! Be especially careful!");
        } else {
            System.out.println("Please check the correct data entry!");
        }
    }
}

package week1;

import java.util.Scanner;

/*
    15. Ввести число від 1 до 12. По номеру місяця визначити пору року і вивести в консоль.
        Якщо користувач вводить недопустиме значення, показати повідомлення з помилкою.
 */
public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a number from 1 to 12:");
        int numberMonth = sc.nextInt();

        if (numberMonth >= 1 && numberMonth <= 2 || numberMonth == 12) {
            System.out.println("Now is the time of year - winter.");
        } else if (numberMonth >= 3 && numberMonth <= 5) {
            System.out.println("Now is the time of year - spring.");
        } else if (numberMonth >= 6 && numberMonth <= 8) {
            System.out.println("Now is the time of year - summer.");
        } else if (numberMonth >= 9 && numberMonth <= 11) {
            System.out.println("Now is the time of year - autumn.");
        } else {
            System.out.println("Error! Input number is incorrect.");
        }
    }
}

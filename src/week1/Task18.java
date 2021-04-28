package week1;

import java.util.Scanner;

/*
    18. Написати програму для розрахунку вартості переговорів, якщо по суботам та
        неділям надається знижка в 20%.
     Ввести тривалість розмови та день тижня (від 1 до 7).
 */
public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What day of the week is it now?");
        int week = sc.nextInt();

        double callCostPerHour = 250.0;
        System.out.println("The cost of a call per hour is: " + callCostPerHour + " UAN.");

        System.out.println("What was the duration of your conversation? Enter a hours, please:");
        int talkTime = sc.nextInt();

        double totalCostOfTheCall = callCostPerHour * talkTime;

        if (week >= 1 && week <= 5) {
            System.out.println("Your conversation went on: " + talkTime + " minutes." +
                    "\nYour call cost is: " + totalCostOfTheCall + " UAN.");
        } else if (week >= 6 && week <= 7) {
            double discount = callCostPerHour * 20 / 100;
            double theCostOfACallAtADiscount = totalCostOfTheCall - discount;

            System.out.println("20% discount on negotiations on the weekend. Your conversation went on: " +
                    talkTime + " minutes." +
                    "\nCall cost with a 20% discount: " + theCostOfACallAtADiscount + " UAN.");
        } else {
            System.out.println("Error! Check that the data entry is correct!");
        }
    }
}

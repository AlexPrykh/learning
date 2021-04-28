package week1;

import java.util.Scanner;

/*
    16. Вирахувати вартість покупки з урахуванням знижки.
        Знижка в 10% надається, якщо сума покупки перевищує 1000 грн.
 */
public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plese, enter the amount you spent on purchases:");
        double amountSpend = sc.nextDouble();

        double discount = amountSpend / 100 * 10;
        if (amountSpend > 1000) {
            System.out.println("You have spent more than 1,000 UAN." + "\nYour amount is: " +
                    amountSpend + " UAN." + "\nYou get a 10% discount." +
                    "\nNow, your amount is: " + (amountSpend - discount));
        } else {
            System.out.println("You spent: " + amountSpend + " UAN.");
        }
    }
}

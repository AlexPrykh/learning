package week1;

import java.util.Scanner;

/*
    Перевести число з десяткової в двійкову систему і навпаки.
    Користувач сам вводить число.
 */
public class BinarySystem {
    public static void binary(int n) {
        int i = bitsInNumber(n);
        int bit;
        while (--i >= 0) {
            bit = (n & (1 << i)) == 0 ? 0 : 1;
            System.out.print(bit);
        }
    }

    public static int bitsInNumber(int n) {
        int result = 0;
        while (n > 0) {
            n >>= 1;
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a binary number or enter a number:");
        int numberOrBinaryNumber = sc.nextInt();

        binary(numberOrBinaryNumber);
        //number in binary system
        //System.out.println(Integer.toBinaryString(numberOrBinaryNumber));
        //back conversion from binary to decimal
        //System.out.println(Integer.parseInt(numberOrBinaryNumber, 2));
    }
}

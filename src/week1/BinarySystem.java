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

    public static int fromBinaryToDecimal(String binaryString) {
        int binaryLength = binaryString.length();
        int decimal = 0;

        for (int i = binaryLength - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1') {
                decimal += Math.pow(2, binaryLength - 1 - i);
            }
        }
        return decimal;
    }

    public static String decimalToBinary(int number) {
        String str = "";
        while (number > 0) {
            int a = number % 2;
            str += "" + a;
            number /= 2;
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter any decimal number:");
        int decimalNumberToBinary = sc.nextInt();
        System.out.println("Binary number: " + decimalToBinary(decimalNumberToBinary));

        sc.nextLine();
        System.out.println("Pleast, enter any binary number:");
        String binaryNumberToDecimal = sc.nextLine();
        System.out.println("Decimal number: " + fromBinaryToDecimal(binaryNumberToDecimal));

        //number in binary system
        //System.out.println(Integer.toBinaryString(numberOrBinaryNumber));
        //back conversion from binary to decimal
        //System.out.println(Integer.parseInt(numberOrBinaryNumber, 2));
    }
}

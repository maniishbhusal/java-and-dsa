// Convert any binary number to decimal

import java.util.Scanner;

public class BinaryToDecimal {

    public static int BinaryToDecimalConverter(int binNum) {
        int decimalValue = 0;
        int power = 0;
        while (binNum != 0) {
            int lastDigit = binNum % 10;
            decimalValue += lastDigit * Math.pow(2, power);
            power++;
            binNum /= 10;
        }
        return decimalValue;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a binary number: ");
            int num = sc.nextInt();
            System.out.println("The decimal number of " + num + " is " + BinaryToDecimalConverter(num));
        }
    }
}
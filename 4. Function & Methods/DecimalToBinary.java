// Convert Decimal value to Binary Number

import java.util.Scanner;

public class DecimalToBinary {

    public static int DecimalToBinaryConverter(int decNum) {
        int binaryNumber = 0;
        int power = 0; // Base for binary place value

        while (decNum != 0) {
            int remainder = decNum % 2;
            // Update binaryNumber by adding the current binary digit (remainder) multiplied
            // by 10^power.
            // This adds the remainder at the first place, simulating the process of
            // constructing the binary number.
            // Example: If binaryNumber = 5 and remainder is 2, binaryNumber becomes 25.
            binaryNumber += remainder * Math.pow(10, power);
            power++;

            decNum /= 2;

        }

        return binaryNumber;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter decimal number: ");
            int num = sc.nextInt();
            System.out.println("The binary number of " + num + " is " + DecimalToBinaryConverter(num));
        }
    }
}
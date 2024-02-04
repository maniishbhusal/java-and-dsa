/*
    * * * * *
   * * * * *
  * * * * *
 * * * * *
* * * * *

 */

import java.util.Scanner;

public class SolidRhombusPattern {

    public static void printSolidRhombusPattern(int n) {
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            printSolidRhombusPattern(num);
        }
    }
}
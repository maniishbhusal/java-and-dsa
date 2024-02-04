/*

     *
   * * *
  * * * * *
 * * * * * * *
 * * * * * * *
  * * * * *
   * * *
     *

*/

import java.util.Scanner;

public class DiamondPattern {

    public static void printDiamondPattern(int n) {

        for (int i = 1; i <= n; i++) {

            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= (2 * i) - 1; j++) { // to find odd value: 2n-1 or 2n+1
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            printDiamondPattern(num);
        }
    }
}
/*
    * * * * *
   *       *
  *       *
 *       *
* * * * *

 */

import java.util.Scanner;

public class HollowRhombus {

    public static void printHollowRhombus(int num) {
        for (int i = 1; i <= num; i++) {
            // space
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            // hollow rectangle - star
            for (int j = 1; j <= num; j++) {
                if (i == 1 || i == num || j == 1 || j == num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            printHollowRhombus(num);
        }
    }
}
/*

    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

 */

import java.util.Scanner;

public class NumberPyramid {

    public static void printNumberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            printNumberPyramid(num);
        }
    }
}
/*

        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5

 */

import java.util.Scanner;

public class PalindromicPatternWithNumbers {

    public static void printPalindromicPatternWithNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // descending
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // ascending
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            printPalindromicPatternWithNumbers(num);
        }
    }
}
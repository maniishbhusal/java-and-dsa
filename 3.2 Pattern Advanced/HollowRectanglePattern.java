/*
* * * * *   1st row
*       *   2nd row
*       *   3rd row
*       *   4th row
* * * * *   5th row
 */

import java.util.Scanner;

public class HollowRectanglePattern {

    public static void printHollowRectanglePattern(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    // boundary cells
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
            System.out.print("Enter no of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter no of columns: ");
            int cols = sc.nextInt();
            printHollowRectanglePattern(rows, cols);
        }
    }
}
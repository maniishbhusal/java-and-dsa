/*
*             *
* *         * *
* * *     * * *
* * * * * * * *
* * * * * * * *
* * *     * * *   
* *         * *
*             *
 */



import java.util.Scanner;

public class ButterflyPattern {

    public static void printButterflyPattern(int num) {
        // 1st half
        for (int i = 1; i <= num; i++) {
            // Stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Space - 2*(num-i)
            for (int j = 1; j <= 2 * (num - i); j++) {
                System.out.print(" ");
            }
            // Stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = num; i >= 1; i--) {
            // Stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Space - 2*(num-i)
            for (int j = 1; j <= 2 * (num - i); j++) {
                System.out.print(" ");
            }
            // Stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            printButterflyPattern(num);
        }
    }
}
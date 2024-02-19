// Print numbers from n to 1 (Decreasing Order)

import java.util.Scanner;

public class PrintFromNTo1 {

    public static void printNoFromNTo1(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        printNoFromNTo1(n - 1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            printNoFromNTo1(num);
        }
    }
}
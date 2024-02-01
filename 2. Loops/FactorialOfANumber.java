// Write a program to find the factorial of any number entered by the user.

import java.util.Scanner;

public class FactorialOfANumber {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            int factorial = 1;
            for (int i = num; i >= 1; i--) {
                factorial *= i;
            }
            System.out.println("The factorial of " + num + " is " + factorial);
        }
    }
}
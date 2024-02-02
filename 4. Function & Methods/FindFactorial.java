// Factorial of a number, n

import java.util.Scanner;

public class FindFactorial {

    public static int factorial(int n) {
        int fact = 1;
        if (n > 0) {

            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
        } else {
            fact = 1;
        }
        return fact;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            int fact = factorial(num);
            System.out.println("The factorial of " + num + " is " + fact);
        }
    }
}
// Binomial Coefficient: nCr = n! / r! * (n - r)!

import java.util.Scanner;

public class BinomialCoefficient {

    // it calculates the factorial of a given number.
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // It uses the `factorial` method to calculate the factorial of `n`, `r`, and `n-r`
    public static int findBinomial(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            System.out.print("Enter r: ");
            int r = sc.nextInt();
            System.out.println("The binomial coefficient is " + findBinomial(n, r));
        }
    }
}
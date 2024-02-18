// Check if a number is prime or not.

import java.util.Scanner;

public class CheckPrimeOrNott {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            // Check if the number is less than or equal to 1
            if (num <= 1) {
                System.out.println(num + " isn't a prime number.");
                return;
            }

            // Initialize a boolean variable to track if the number is prime
            boolean isPrime = true;

            // Iterate from 2 to the square root of the number for efficiency
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    System.out.println(num + " isn't a prime number.");
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is a prime number.");
            }
        }
    }
}

// Print all prime numbers in a range

import java.util.Scanner;

public class PrintAllPrimesInRange {

// The `isPrime` method is a helper method that checks whether a given number `num` is prime or not. 
    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

// The `printPrimeInRange` method is responsible for printing all the prime numbers in a given range.
    public static void printPrimeInRange(int num) {
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.println("The prime number less than " + num + " is: ");
            printPrimeInRange(num);
        }
    }
}
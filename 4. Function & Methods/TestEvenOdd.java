/*
 * Write a method named isEven that accepts an integer argument. The method
 * should return true if the argument is even, or false otherwise. Additionally,
 * write a program to test your method.
 */

import java.util.Scanner;

public class TestEvenOdd {

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (isEven(num)) {
                System.out.println(num + " is even");
            } else {

                System.out.println(num + " is odd");
            }
        }
    }
}
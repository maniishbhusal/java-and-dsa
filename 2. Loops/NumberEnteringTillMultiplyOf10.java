//  Keep entering numbers till user enters a multiple of 10.

import java.util.Scanner;

public class NumberEnteringTillMultiplyOf10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                System.out.print("Enter a number: ");
                int num = sc.nextInt();
                if (num % 10 == 0) {
                    System.out.println("You entered " + num + " so you are out of a loop.");
                    break;
                }
                System.out.println(num);
            }
        } finally {
            sc.close();
        }
    }
}
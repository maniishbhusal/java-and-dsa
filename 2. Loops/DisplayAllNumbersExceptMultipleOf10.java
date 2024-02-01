// Display all numbers entered by user except multiples of 10

import java.util.Scanner;

public class DisplayAllNumbersExceptMultipleOf10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            do {
                System.out.print("Enter a number: ");
                int num = sc.nextInt();
                if (num % 10 == 0) {
                    continue;
                }
                System.out.println(num);
            } while (true);

        } finally {
            sc.close();
        }
    }
}
// WAP to check if a number is palindrome or not

import java.util.Scanner;

public class CheckPalindromee {

    public static void palindrome(int num) {
        int rev = 0;
        int originalNum = num;
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        if (originalNum == rev) {
            System.out.println(originalNum + " is palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome number.");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            palindrome(num);
        }
    }
}
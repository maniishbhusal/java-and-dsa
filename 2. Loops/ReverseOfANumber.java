import java.util.Scanner;

public class ReverseOfANumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int reverse = 0;
            while (n != 0) {
                int mod = n % 10;
                reverse = reverse * 10 + mod;
                n /= 10;
            }
            System.out.println("Reverse: " + reverse);
        } finally {
            sc.close();
        }
    }
}
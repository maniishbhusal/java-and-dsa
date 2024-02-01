import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {

    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            while (i <= n) {
                sum += i;
                i++;
            }
            System.out.println("The sum of first " + n + " natural number is " + sum);
        } finally {
            sc.close();
        }
    }
}
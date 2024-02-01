import java.util.Scanner;

public class FindAverage {

    public static void main(String[] args) {
        System.out.println("Enter three numbers: ");
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int avg = (a + b + c) / 3;
            System.out.println("Average: " + avg);
        } finally {
            sc.close();
        }
    }
}
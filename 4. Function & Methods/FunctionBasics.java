import java.util.Scanner;

public class FunctionBasics {

    // Sum of two numbers
    public static int sumOfTwoNumbers(int a, int b) {
        return a + b;
    }

    // Swapping of two numbers
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a after swapping: " + a);
            System.out.println("b after swapping: " + b);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            swap(a, b);
            System.out.println("Original value of a: " + a);
            System.out.println("Original value of b: " + b);
        }
    }
}

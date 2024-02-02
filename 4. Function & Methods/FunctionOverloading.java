// Function Overloading: Multiple functions with the same name but different parameters.

public class FunctionOverloading {

    // function to calculate sum of two numbers
    public static int calculateSum(int a, int b) {
        return a + b;
    }

    // function to calculate sum of three numbers
    public static int calculateSum(int a, int b, int c) {
        return a + b + c;
    }

    // function to calculate sum of two numbers but floating value
    public static float calculateSum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 2, b = 3, c = 12;
        System.out.println("Sum of " + a + " and " + b + " is " + calculateSum(a, b));
        System.out.println("Sum of " + a + ", " + b + " and " + c + " is " + calculateSum(a, b, c));
        System.out.println("Sum of " + a + " and " + b + " is " + calculateSum((float) a, (float) b));

    }
}
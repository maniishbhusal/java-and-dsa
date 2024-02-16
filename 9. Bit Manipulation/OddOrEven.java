// Check if a number is odd or even

public class OddOrEven {

    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) // 4 - 100 & 1- 001
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    public static void main(String[] args) {
        oddOrEven(13);
        oddOrEven(7);
        oddOrEven(4);
    }
}
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */

public class PrintHalfPyramidPattern {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Inverted Number Pattern");

        // Inverted number pattern
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
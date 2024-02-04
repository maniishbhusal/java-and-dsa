/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2 
1
 */

public class InvertedHalfPyramidWithNumbers {

    public static void printInvertedHalfPyramid(int num) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num = 5;
        printInvertedHalfPyramid(num);
    }
}
/*
        *
      * *
    * * *
  * * * * 
* * * * *
 */

public class InvertedAndRotatedHalfPyramid {

    public static void printInvertedAndRotatedHalfPyramid(int rows) {

        for (int i = 1; i <= rows; i++) {
            // Spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 5;
        printInvertedAndRotatedHalfPyramid(rows);
    }
}
import java.util.Scanner;

public class CreationOf2DArrays {

    // find largest element in matrix
    public static int largest(int matrix[][]) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                maxValue = Math.max(maxValue, matrix[i][j]);
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {

        int matrix[][] = new int[3][3];
        int n = matrix.length; // row
        int m = matrix[0].length; // col

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter " + n + "*" + m + " matrix: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
        }

        System.out.println();
        System.out.println("Matrix");

        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The maximum value is " + largest(matrix));
    }
}
public class DiagonalSum {

    public static void diagonalSum(int matrix[][]) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            // Brute force solution
            // for (int j = 0; j < matrix[0].length; j++) {
            // if (i == j) {
            // sum += matrix[i][j];
            // } else if (i + j == matrix.length - 1) {
            // sum += matrix[i][j];
            // }
            // }

            // Optimized Solution
            sum += matrix[i][i]; // primary diagonal
            if (i != matrix.length - 1 - i) // secondary diagonal
                sum += matrix[i][matrix.length - 1 - i];
        }

        System.out.println("Sum of primary & secondary diagonal is " + sum);
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3 },
                { 5, 6, 7 },
                { 9, 10, 12 },
        };
        diagonalSum(matrix);
    }
}
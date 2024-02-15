// find the transpose of matrix
public class Transpose {

    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transpose(int[][] matrix, int[][] transposedMatrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        printMatrix(matrix);
        int transposedMatrix[][] = new int[matrix[0].length][matrix.length];
        transpose(matrix, transposedMatrix);
        System.out.println("Transponsed matrix:");
        printMatrix(transposedMatrix);
    }
}
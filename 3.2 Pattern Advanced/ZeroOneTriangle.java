/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
 */

public class ZeroOneTriangle {

    public static void printZeroOneTriangle(int num) {
        // 1st Method:
        /*
         * for (int i = 1; i <= num; i++) {
         * if (i % 2 == 0) {
         * for (int j = 0; j < i; j++) {
         * System.out.print(j % 2 + " ");
         * }
         * } else {
         * for (int j = 1; j <= i; j++) {
         * System.out.print(j % 2 + " ");
         * }
         * }
         * System.out.println();
         * }
         */

        // 2nd Method:
        // if sum of (i + j) is even, print 1, otherwise 0.
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num = 5;
        printZeroOneTriangle(num);
    }
}
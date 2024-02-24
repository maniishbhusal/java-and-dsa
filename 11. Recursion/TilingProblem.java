/*
 Given a "2*n" board and tiles of size "2*1", count the number of ways to tile
 the given board using the 2*1 tiles. (A tile can either be placed
 horizontally or vertically)
 */

public class TilingProblem {

    public static int countWays(int n) {
        // base case
        if (n <= 1)
            return 1;
        if (n == 2)
            return 2;

        // vertical choice
        int vertical = countWays(n - 1);

        // horizontal choice
        int horizontal = countWays(n - 2);

        return vertical + horizontal;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Number of ways to tile the board: " + countWays(n));
    }
}
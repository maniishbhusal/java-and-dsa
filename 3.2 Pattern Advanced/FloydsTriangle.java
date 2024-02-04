/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */

public class FloydsTriangle {

    public static void printFloydsTriangle(int num) {
        int counter = 1;
        // outer
        for (int i = 1; i <= num; i++) {
            // inner - how many times will counter be printed
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num = 5;
        printFloydsTriangle(num);
    }
}
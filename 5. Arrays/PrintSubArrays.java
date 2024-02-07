/*
 Print Subarrays
 A continuous part of array
 */

public class PrintSubArrays {

    public static void printSubArrays(int numbers[]) {
        int totalSubArray = 0;
        int len = numbers.length;
        for (int i = 0; i < len; i++) { // low (where to start)
            for (int j = i; j < len; j++) { // high (where to stop)
                for (int k = i; k <= j; k++) { // print from low to high
                    System.out.print("" + numbers[k] + " ");
                }
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarray: " + totalSubArray);

        System.out.println();

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 44, 6, 8, 10 };
        printSubArrays(numbers);
    }
}
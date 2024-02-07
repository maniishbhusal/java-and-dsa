/*
 Find max and min sum of Subarrays --> Brute Force
 A continuous part of array
 */

 public class MaxMinSubArray {

    public static void printSubArrays(int numbers[]) {
        int len = numbers.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) { // low (where to start)
            for (int j = i; j < len; j++) { // high (where to stop)
                int currentSum = 0;
                for (int k = i; k <= j; k++) { // print from low to high
                    currentSum += numbers[k];
                }
                System.out.print(currentSum + " ");
                if (currentSum > max) {
                    max = currentSum;
                }
                if (currentSum < min) {
                    min = currentSum;
                }

            }
        }
        System.out.println();
        System.out.println("The maximum sum is: " + max);
        System.out.println("The minimum sum is: " + min);

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubArrays(numbers);
    }
}
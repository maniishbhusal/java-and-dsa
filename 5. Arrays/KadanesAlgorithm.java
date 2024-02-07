public class KadanesAlgorithm {

    public static void maxSubArray(int inputArray[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (currentSum < 0) {
                currentSum = 0;
            }
            currentSum += inputArray[i];
            maxSum = Math.max(currentSum, maxSum);
        }

        System.out.println("Our Max sub array sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int inputArray[] = { -2, -3, -4, -1, -2, -71, -5, -3 };
        maxSubArray(inputArray);
    }
}
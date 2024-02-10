// Given an integer array nums, rotate the array to the right by k steps, where
// k is non-negative.

public class RotateArray {

    public static void rotateArray(int nums[], int si, int ei) {
        for (int i = si, j = ei; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6 };
        int k = 5;
        k %= nums.length; // Correctly handle cases where k is greater than the length of the array
        rotateArray(nums, 0, nums.length - 1); // reverse whole array
        rotateArray(nums, 0, k - 1); // reverse first kth part
        rotateArray(nums, k, nums.length - 1); // reverse remaining part

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
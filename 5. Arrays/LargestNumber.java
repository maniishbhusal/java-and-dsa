/*
 Find the largest number in the given array:
 {1,2,3,4,5}
 */

public class LargestNumber {

    public static int findLargest(int arr[]) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 11, 2, 3, 4, 5 };
        System.out.println("The largest number in an array is: " + findLargest(arr));
    }
}
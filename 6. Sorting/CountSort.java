public class CountSort {
    public static void countSort(int arr[]) {
        // find the largest element in the array
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        // create a count array of size 'max + 1' to store the count of each number in
        // the input array
        int count[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++; // increment the count of arr[i] in count array
        }
        // modify the count array such that each element at each index
        // stores the sum of previous counts.
        for (int i = 1; i <= max; i++) {
            count[i] = count[i] + count[i - 1];
        }
        // create an output array
        int output[] = new int[arr.length];
        // Build the output array, To make it stable we are operating in reverse order.
        for (int i = arr.length - 1; i >= 0; i--) {
            output[--count[arr[i]]] = arr[i];
        }
        // Copy the sorted elements into original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
        // print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 1, 5, 3, 1, 3, 5 };
        countSort(arr);
    }
}
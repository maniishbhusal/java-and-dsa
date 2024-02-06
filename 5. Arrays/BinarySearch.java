/*
 * Binary Search: It is defined as a searching algorithm used in a sorted array
 * by repeatedly dividing the search interval in half.
 */

public class BinarySearch {

    public static int binarySearch(int numbers[], int key) {
        int low = 0, high = numbers.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (numbers[mid] == key) { // found
                return mid;
            }
            if (key > numbers[mid]) { // right
                low = mid + 1;
            } else { // left
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 6;
        int index = binarySearch(numbers, key);
        if (index == -1) {
            System.out.print(key + " is not in the array");
        } else {
            System.out.println(key + " is at index " + index);
        }
    }
}
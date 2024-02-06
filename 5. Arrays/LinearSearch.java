/*
 Linear Search:
 find the index of element in a given array:
 key = 10
 {2, 4, 6, 8, 10, 12, 14, 16}
 */

public class LinearSearch {

    public static int findIndex(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 160 };
        int key = 16;
        int index = findIndex(arr, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.print("The number " + key + " is at index " + index);
        }
    }
}
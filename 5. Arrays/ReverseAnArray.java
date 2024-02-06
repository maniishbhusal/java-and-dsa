/*
 Reverse an Array: {2,4,6,8,10}
 */

public class ReverseAnArray {

    public static void reverse(int arr[]) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            // swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
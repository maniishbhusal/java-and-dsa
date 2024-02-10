public class BubbleSort {

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) { // outer loop for passes
            boolean flag = false; // it track whether the array is already sorted or not

            for (int j = 0; j < arr.length - 1 - i; j++) { // inner loop for comparision
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            // If no swaps were made in this pass, the array is already sorted
            if (!flag) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        bubbleSort(arr);
        // print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
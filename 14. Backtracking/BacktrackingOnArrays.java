public class BacktrackingOnArrays {

    public static void changeArr(int arr[], int i) {
        // base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }

        // recursion
        arr[i] = i + 1;
        changeArr(arr, i + 1);
        arr[i] -= 2; // backtracking step
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = new int[n];
        changeArr(arr, 0);
        printArr(arr);
    }
}
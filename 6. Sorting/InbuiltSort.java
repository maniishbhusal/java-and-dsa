import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {

    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 1, -9, 33 };
        Arrays.sort(arr); // sort
        Arrays.sort(arr, 1, 4); // sort according to range
        Arrays.sort(arr, Collections.reverseOrder()); // sort in reverse order
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
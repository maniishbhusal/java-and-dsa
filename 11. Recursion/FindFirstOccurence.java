// WAP to find the first occurence of an element in an array

public class FindFirstOccurence {

    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length) // checks till last, which means key not found
        return -1;

        if (arr[i] == key) // key found
            return i;

        return firstOccurence(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int key = 5;

        int index = firstOccurence(arr, key, 0);
        if (index == -1)
            System.out.println("key not found");
        else
            System.out.println(key + " is at index " + index);
    }
}
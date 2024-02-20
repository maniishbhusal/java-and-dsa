// WAP to find the first occurence of an element in an array

public class FindLastOccurence {

    public static int lastOccurence(int arr[], int key, int i) {
        if (i == -1)
            return -1;
        if (arr[i] == key)
            return i;
        return lastOccurence(arr, key, i - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int key = 5;

        int index = lastOccurence(arr, key, arr.length - 1);
        if (index == -1)
            System.out.println("key not found");
        else
            System.out.println(key + " is at index " + index);
    }
}
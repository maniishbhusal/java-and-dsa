import java.util.Arrays;

public class ArrayList {

    public static class Arraylist {
        // public Arraylist() {
        // int arr[] = new int[5];
        // }
        int[] arr = new int[2];
        int index = 0;
        int size = 0;

        public void add(int element) {
            if (size == arr.length) { // 2==2
                int brr[] = Arrays.copyOf(arr, arr.length * 2); // double the size of original Array
                // arr = new int[brr.length]; // empty original Array of size of new Array
                // arr = Arrays.copyOf(brr, brr.length); // copy new Array to original Array
                arr = brr;
            }
            arr[index] = element;
            index++;
            size++;
        }

        public int getArrValue(int i) {
            return arr[i];
        }

        public void set(int i, int value) {
            arr[i] = value;
        }

    }

    public static void main(String[] args) {
        Arraylist arr = new Arraylist();
        arr.add(23);
        arr.add(13);
        arr.add(2);
        arr.add(21);
        arr.add(32);
        arr.set(0, 10);
        System.out.println(arr.getArrValue(0));
        System.out.println(arr.size);
    }
}
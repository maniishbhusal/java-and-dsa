import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Reverse
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Maximum in an arraylist
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max)
                max = list.get(i);
        }
        System.out.println("Maximum number: " + max);

        // swap two integers
        swap(list, 2, 3);

        System.out.println("List after swapping: " + list);

        // Sorting an ArrayList
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("List after sorting: " + list);
    }
}
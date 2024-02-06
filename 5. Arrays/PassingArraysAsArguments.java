//  Passing Arrays As Arguments

public class PassingArraysAsArguments {

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i]++;
        }
        System.out.println("Marks in small function");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int marks[] = { 3, 2, 11, 12, 76 };
        System.out.println("Marks in main function before update function");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        update(marks); // array passed by 'call by reference' as an argument

        System.out.println("Marks in main function after update function");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}
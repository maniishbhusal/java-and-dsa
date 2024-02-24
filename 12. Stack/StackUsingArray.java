// Implementation of Stack Using Array

import java.util.Scanner;

public class StackUsingArray {

    public static void main(String[] args) {
        StackImplementation st1 = new StackImplementation();
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("Enter 1 to PUSH an item: ");
                System.out.println("Enter 2 to POP an item: ");
                System.out.println("Enter 3 to DISPLAY an item: ");
                System.out.println("Enter 0 to EXIT out of the program: ");
                System.out.print("Enter your Choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter an item to push: ");
                        int item = sc.nextInt();
                        st1.push(item);
                        break;
                    case 2:
                        st1.pop();
                        break;
                    case 3:
                        st1.display();
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice");
                        break;
                }

            } while (true);
        }
    }
}

class StackImplementation {
    int stack[];
    int peek = -1;

    public StackImplementation() {
        stack = new int[5];
    }

    // push an item to the stack
    public void push(int item) {
        // check if stack is already full
        if (peek == stack.length - 1) {
            System.out.println("\nStack is full\n");
        } else {
            peek++;
            stack[peek] = item;
            System.out.println("Item added successfully\n");
        }
    }

    // remove item from the stack
    public void pop() {
        // check if the stack is empty
        if (peek == -1) {
            System.out.println("\nCannot remove item, stack is empty!\n");
        } else {
            // int item = stack[peek];
            System.out.println("Item removed from the stack: " + stack[peek]);
            peek--;
        }
    }

    // display items of the stack
    public void display() {
        // check if stack is empty
        if (peek == -1) {
            System.out.println("\nStack is empty\n");
        } else {
            for (int i = peek; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
        }
        System.out.println();
    }
}
// Implementation of a linear queue using arrays

class QueueImplementation {
    int queue[]; // Array to store queue elements
    int front, rear, N; // Front and rear pointers, and size of the queue

    // Constructor to initialize the queue
    QueueImplementation(int c) {
        front = rear = -1; // Initialize front and rear pointers to -1
        N = c; // Set the size of the queue
        queue = new int[N]; // Initialize the array with the given size
    }

    // Method to add an element to the queue
    void enqueue(int item) {
        if (rear == N - 1) {
            // Check if the queue is full
            System.out.println("Queue is full");
            return;
        } else if (front == -1 && rear == -1) {
            // If the queue is empty, initialize front and rear pointers to 0
            front = rear = 0;
            queue[rear] = item; // Add the item to the queue
        } else {
            // If the queue is not empty, increment the rear pointer and add the item
            rear++;
            queue[rear] = item;
        }
    }

    // Method to remove an element from the queue
    void dequeue() {
        if (front == -1 && rear == -1) {
            // Check if the queue is empty
            System.out.println("Queue is empty");
        } else if (front == rear) {
            // If there's only one element in the queue
            System.out.println("Dequeued item: " + queue[front]);
            front = rear = -1; // Reset front and rear pointers
        } else {
            // If there are multiple elements, remove the front element and increment the front pointer
            System.out.println("Dequeued item: " + queue[front]);
            front++;
        }
    }

    // Method to display the elements of the queue
    void display() {
        if (front == -1 && rear == -1) {
            // Check if the queue is empty
            System.out.println("Queue is empty");
        } else {
            // Iterate through the queue and print each element
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    // Method to get the front element of the queue
    void peek() {
        if (front == -1 && rear == -1) {
            // Check if the queue is empty
            System.out.println("Queue is empty");
        } else {
            // Print the front element
            System.out.println("Front element: " + queue[front]);
        }
    }

}

public class LinearQueueUsingArray {
    public static void main(String[] args) {
        // Create a queue with a capacity of 5
        QueueImplementation queue = new QueueImplementation(5);
        
        // Enqueue elements into the queue
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        
        // Display the queue
        queue.display();
        
        // Dequeue an element and display the queue
        queue.dequeue();
        queue.display();
        
        // Peek at the front element
        queue.peek();
        
        // Dequeue all elements
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        
        // Display the queue
        queue.display();
    }
}

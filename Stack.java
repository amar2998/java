public class Stack {
    public static void main(String[] args) {
        St stack = new St();
        stack.push(1);
        stack.push(2);
        stack.display();
    }
}
public class St {
    private static final int MAX_SIZE = 100; // Define the maximum size of the stack
    private int pointer;
    private int[] arr;

    public St() {
        pointer = -1;
        arr = new int[MAX_SIZE]; // Initialize the array with a maximum size
    }

    public void push(int data) {
        if (pointer >= MAX_SIZE - 1) {
            System.out.println("Stack overflow");
            return;
        }
        arr[++pointer] = data;
    }

    public void display() {
        if (pointer == -1) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = pointer; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Print a new line after the stack elements
    }
}


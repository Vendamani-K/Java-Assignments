package DataStructures.MultiStackAssignment;

public class FixedStack {

    private int[] arr;
    private int top;
    private int capacity;

    public FixedStack(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }

    // Push an element
    public void push(int data) {

        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }

        top++;
        arr[top] = data;
    }

    // Pop an element
    public int pop() {

        if (isEmpty()) {
            return -1;
        }

        int removed = arr[top];
        top--;

        return removed;
    }

    // View top element
    public int peek() {

        if (isEmpty()) {
            return -1;
        }

        return arr[top];
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    // Display this stack
    public void display() {

        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}


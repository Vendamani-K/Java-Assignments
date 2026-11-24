package DataStructures.MultiStackAssignment;



import java.util.ArrayList;

public class MultiStack {

    private ArrayList<FixedStack> stacks;
    private int stackCapacity;

    public MultiStack(int stackCapacity) {

        this.stackCapacity = stackCapacity;

        stacks = new ArrayList<>();

        // Create the first stack
        stacks.add(new FixedStack(stackCapacity));
    }

    // Push an element
    public void push(int data) {

        FixedStack currentStack = stacks.get(stacks.size() - 1);

        // If current stack is full, create a new stack
        if (currentStack.isFull()) {

            currentStack = new FixedStack(stackCapacity);

            stacks.add(currentStack);

            System.out.println("New stack created");
        }

        currentStack.push(data);

        System.out.println(data + " pushed");
    }

    // Pop an element
    public int pop() {

        if (stacks.isEmpty()) {
            System.out.println("MultiStack is empty");
            return -1;
        }

        FixedStack currentStack = stacks.get(stacks.size() - 1);

        // Remove empty stacks from the end
        while (currentStack.isEmpty() && stacks.size() > 1) {

            stacks.remove(stacks.size() - 1);

            currentStack = stacks.get(stacks.size() - 1);
        }

        if (currentStack.isEmpty()) {
            System.out.println("MultiStack is empty");
            return -1;
        }

        int removed = currentStack.pop();

        // Remove stack if it becomes empty
        if (currentStack.isEmpty() && stacks.size() > 1) {
            stacks.remove(stacks.size() - 1);
        }

        return removed;
    }

    // Peek at the top element
    public int peek() {

        FixedStack currentStack = stacks.get(stacks.size() - 1);

        while (currentStack.isEmpty() && stacks.size() > 1) {

            stacks.remove(stacks.size() - 1);

            currentStack = stacks.get(stacks.size() - 1);
        }

        return currentStack.peek();
    }

    // Display all stacks
    public void display() {

        System.out.println("\nMultiStack:");

        for (int i = 0; i < stacks.size(); i++) {

            System.out.print("Stack " + (i + 1) + ": ");

            stacks.get(i).display();
        }
    }

    // Total number of elements
    public int size() {

        int total = 0;

        for (FixedStack stack : stacks) {
            total += stack.size();
        }

        return total;
    }

    public boolean isEmpty() {

        for (FixedStack stack : stacks) {

            if (!stack.isEmpty()) {
                return false;
            }
        }

        return true;
    }
}

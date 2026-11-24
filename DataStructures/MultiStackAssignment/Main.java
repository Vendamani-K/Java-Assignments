package DataStructures.MultiStackAssignment;




public class Main {

    public static void main(String[] args) {

        // Each stack can store 3 elements
        MultiStack multiStack = new MultiStack(3);

        // Push elements
        multiStack.push(10);
        multiStack.push(20);
        multiStack.push(30);

        multiStack.push(40);
        multiStack.push(50);
        multiStack.push(60);

        multiStack.push(70);

        // Display all stacks
        multiStack.display();

        System.out.println("\nTotal elements: " + multiStack.size());

        // Peek
        System.out.println("Top element: " + multiStack.peek());

        // Pop elements
        System.out.println("\nPopped: " + multiStack.pop());
        System.out.println("Popped: " + multiStack.pop());

        // Display after popping
        multiStack.display();

        System.out.println("\nTotal elements: " + multiStack.size());
    }
}

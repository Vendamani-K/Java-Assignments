package Collections.PriorityQueueAssignment;



public class Main {

    public static void main(String[] args) {

        // Create custom priority queue
        CustomPriorityQueue queue = new CustomPriorityQueue();

        // Add tasks
        queue.add(new Task(101, "Complete assignment", 3));
        queue.add(new Task(102, "Fix production bug", 1));
        queue.add(new Task(103, "Attend meeting", 2));
        queue.add(new Task(104, "Prepare report", 4));

        // Display tasks
        System.out.println("Initial Priority Queue:");
        queue.display();

        // Peek highest-priority task
        System.out.println("\nHighest Priority Task:");
        System.out.println(queue.peek());

        // Update priority
        System.out.println("\nUpdating Task 104 priority to 1:");

        queue.updatePriority(104, 1);

        queue.display();

        // Remove highest-priority task
        System.out.println("\nRemoving Highest Priority Task:");

        Task removedTask = queue.remove();

        System.out.println("Removed: " + removedTask);

        // Display remaining tasks
        System.out.println("\nRemaining Tasks:");
        queue.display();

        // Display queue size
        System.out.println("\nQueue Size: " + queue.size());

        // Check if queue is empty
        System.out.println("Is Queue Empty? " + queue.isEmpty());
    }
}

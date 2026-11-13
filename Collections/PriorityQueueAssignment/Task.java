package Collections.PriorityQueueAssignment;



public class Task {

    private int id;
    private String name;
    private int priority;

    // Constructor
    public Task(int id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    // Update priority
    public void setPriority(int priority) {
        this.priority = priority;
    }

    // Display task details
    @Override
    public String toString() {
        return "Task{id=" + id +
                ", name='" + name +
                "', priority=" + priority + "}";
    }
}

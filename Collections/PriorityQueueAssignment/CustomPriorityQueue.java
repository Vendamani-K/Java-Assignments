package Collections.PriorityQueueAssignment;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Comparator;

public class CustomPriorityQueue {

    // Stores tasks in heap order
    private ArrayList<Task> heap = new ArrayList<>();

    // Stores task ID and its position in the heap
    private HashMap<Integer, Integer> positions = new HashMap<>();

    // Compare tasks based on priority
    private Comparator<Task> comparator =
            Comparator.comparingInt(Task::getPriority)
                      .thenComparingInt(Task::getId);

    // Add a task
    public void add(Task task) {

        if (positions.containsKey(task.getId())) {
            throw new IllegalArgumentException("Task ID already exists");
        }

        heap.add(task);

        int index = heap.size() - 1;

        positions.put(task.getId(), index);

        // Move task up if necessary
        siftUp(index);
    }

    // Remove highest-priority task
    public Task remove() {

        if (heap.isEmpty()) {
            return null;
        }

        Task removedTask = heap.get(0);

        Task lastTask = heap.remove(heap.size() - 1);

        positions.remove(removedTask.getId());

        if (!heap.isEmpty()) {

            heap.set(0, lastTask);

            positions.put(lastTask.getId(), 0);

            siftDown(0);
        }

        return removedTask;
    }

    // View highest-priority task without removing it
    public Task peek() {

        if (heap.isEmpty()) {
            return null;
        }

        return heap.get(0);
    }

    // Update the priority of an existing task
    public boolean updatePriority(int taskId, int newPriority) {

        Integer index = positions.get(taskId);

        if (index == null) {
            return false;
        }

        Task task = heap.get(index);

        int oldPriority = task.getPriority();

        task.setPriority(newPriority);

        if (newPriority < oldPriority) {

            siftUp(index);

        } else if (newPriority > oldPriority) {

            siftDown(index);
        }

        return true;
    }

    // Move task upward
    private void siftUp(int index) {

        while (index > 0) {

            int parentIndex = (index - 1) / 2;

            if (comparator.compare(
                    heap.get(index),
                    heap.get(parentIndex)) >= 0) {
                break;
            }

            swap(index, parentIndex);

            index = parentIndex;
        }
    }

    // Move task downward
    private void siftDown(int index) {

        int size = heap.size();

        while (true) {

            int smallest = index;

            int left = 2 * index + 1;

            int right = 2 * index + 2;

            if (left < size &&
                    comparator.compare(heap.get(left),
                                       heap.get(smallest)) < 0) {

                smallest = left;
            }

            if (right < size &&
                    comparator.compare(heap.get(right),
                                       heap.get(smallest)) < 0) {

                smallest = right;
            }

            if (smallest == index) {
                break;
            }

            swap(index, smallest);

            index = smallest;
        }
    }

    // Swap two tasks
    private void swap(int i, int j) {

        Task temp = heap.get(i);

        heap.set(i, heap.get(j));

        heap.set(j, temp);

        positions.put(heap.get(i).getId(), i);

        positions.put(heap.get(j).getId(), j);
    }

    // Display all tasks in priority order without changing the queue
    public void display() {

        ArrayList<Task> sortedTasks = new ArrayList<>(heap);

        sortedTasks.sort(comparator);

        for (Task task : sortedTasks) {
            System.out.println(task);
        }
    }

    // Get queue size
    public int size() {
        return heap.size();
    }

    // Check whether queue is empty
    public boolean isEmpty() {
        return heap.isEmpty();
    }
}

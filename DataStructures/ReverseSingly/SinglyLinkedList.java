package DataStructures.ReverseSingly;

public class SinglyLinkedList {

    Node head;

    // Add elements at the end
    public void add(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Reverse the linked list
    public void reverse() {

        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {

            next = current.next;

            current.next = previous;

            previous = current;

            current = next;
        }

        head = previous;
    }

    // Display the linked list
    public void display() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
}

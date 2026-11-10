package Collections.EmployeeSetAssignment;


import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // Create three Sets
        Set<Employee> treeSet = new TreeSet<>();

        Set<Employee> hashSet = new HashSet<>();

        Set<Employee> linkedHashSet = new LinkedHashSet<>();

        // Create employee objects
        Employee e1 = new Employee(103, "Ravi");
        Employee e2 = new Employee(101, "Kumar");
        Employee e3 = new Employee(102, "Priya");
        Employee e4 = new Employee(101, "Arun");

        // Add employees to TreeSet
        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);

        // Add employees to HashSet
        hashSet.add(e1);
        hashSet.add(e2);
        hashSet.add(e3);
        hashSet.add(e4);

        // Add employees to LinkedHashSet
        linkedHashSet.add(e1);
        linkedHashSet.add(e2);
        linkedHashSet.add(e3);
        linkedHashSet.add(e4);

        // Display TreeSet
        System.out.println("TreeSet (Sorted by ID):");
        for (Employee employee : treeSet) {
            System.out.println(employee);
        }

        // Display HashSet
        System.out.println("\nHashSet (No guaranteed order):");
        for (Employee employee : hashSet) {
            System.out.println(employee);
        }

        // Display LinkedHashSet
        System.out.println("\nLinkedHashSet (Insertion Order):");
        for (Employee employee : linkedHashSet) {
            System.out.println(employee);
        }

        // Validate results
        System.out.println("\n--- Validation ---");

        System.out.println("TreeSet size: " + treeSet.size());
        System.out.println("HashSet size: " + hashSet.size());
        System.out.println("LinkedHashSet size: " + linkedHashSet.size());

        System.out.println(
            "TreeSet contains employee ID 101: "
            + treeSet.contains(new Employee(101, "Test"))
        );

        System.out.println(
            "HashSet contains employee ID 101: "
            + hashSet.contains(new Employee(101, "Test"))
        );

        System.out.println(
            "LinkedHashSet contains employee ID 101: "
            + linkedHashSet.contains(new Employee(101, "Test"))
        );
    }
}

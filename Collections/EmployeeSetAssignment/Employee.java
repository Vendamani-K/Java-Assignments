package Collections.EmployeeSetAssignment;


import java.util.Objects;

public class Employee implements Comparable<Employee> {

    private int id;
    private String name;

    // Constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Compare employees based on ID
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }

    // Check duplicates based on employee ID
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Employee employee = (Employee) obj;

        return this.id == employee.id;
    }

    // Generate hash code based on employee ID
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Display employee details
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

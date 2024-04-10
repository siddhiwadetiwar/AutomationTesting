package test;

// Superclass Employee
class Employee {
    // Fields
    protected String name;
    protected double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass oops inheriting from Employee
public class oops extends Employee {
    // Additional field specific to oops class
    private int id;

    // Constructor
    public oops(int id, String name, double salary) {
        super(name, salary); // Call to superclass constructor
        this.id = id;
    }

    // Overriding method from superclass
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call to superclass method
        System.out.println("ID: " + id);
    }

    // Main method to demonstrate all OOP concepts
    public static void main(String[] args) {
        // Creating an object of the oops class
        oops obj = new oops(1, "John Doe", 50000);

        // Demonstrating object creation, encapsulation, and method invocation
        obj.displayInfo();

        // Demonstrating inheritance
        Employee emp = new oops(2, "Jane Doe", 60000);
        emp.displayInfo(); 
    }
}

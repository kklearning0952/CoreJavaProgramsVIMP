package main.java.com.java8.stream.Intermediate;

public class EmployeeClass {

    private int id;

    private String name;

    private double salary;

    private String department;

    public EmployeeClass(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public EmployeeClass(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + salary + " - " + department;
    }
}

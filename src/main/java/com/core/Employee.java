package main.java.com.core;


public class Employee {
    private int id;

    private String name;

    private double salary;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "name : " + name + "---" + "salary" + salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Employee)) {
            return false;
        }

        Employee other = (Employee) obj;
        return this.id == other.id;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}

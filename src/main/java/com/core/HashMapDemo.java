package main.java.com.core;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Kiran");
        Employee emp2 = new Employee(101, "Kiran");

        Map<Employee, String> employees = new HashMap<>();

        employees.put(emp1, "Developer");
        employees.put(emp2, "Senior Developer");
        employees.put(null,"BA");
        employees.put(null,"KK");

        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());
        System.out.println(emp1.equals(emp2));
        System.out.println(employees);
    }
}

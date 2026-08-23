package main.java.com.core;

import java.util.*;

public class Demo1 {

    public static void main(String[] args) {


        List<Employee> employees = Arrays.asList(
                new Employee("Amit", 45000),
                new Employee("Rahul", 65000),
                new Employee("Priya", 75000),
                new Employee("Neha", 50000)
        );

        //Print the names of employees whose salary is greater than ₹55,000, sorted by salary in descending order.

        employees.stream().filter(emp -> emp.getSalary() > 55000).sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(emp -> System.out.println(emp.getName()));
        System.out.println(m1());

    }

    public static int m1() {
        try {
            return 10;
        } finally {
            return 20;
        }
    }
}

package main.java.com.java8.stream.Intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class P10_SecondHighestSalaryofEmployee {

    public static void main(String[] args) {
        List<EmployeeClass> employess = Arrays.asList(
                new EmployeeClass(1, "John", "IT", 60000),
                new EmployeeClass(2, "Alice", "HR", 55000),
                new EmployeeClass(3, "Bob", "IT", 75000),
                new EmployeeClass(4, "Carol", "HR", 70000),
                new EmployeeClass(5, "David", "Finance", 65000),
                new EmployeeClass(6, "Eve", "IT", 80000),
                new EmployeeClass(7, "Frank", "Finance", 64000),
                new EmployeeClass(8, "Ala", "Operations", 44000)
        );

        //2nd Highest salary of employees

        Optional<Double> first = employess.stream()
                .map(EmployeeClass::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(first);
                
    }
}

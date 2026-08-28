package main.java.com.java8.stream.Intermediate;

import main.java.com.core.Employee;

import java.io.BufferedReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P08_DepartmenetEmployeeCount {
    //Find all departments with more than 2 employees

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
    /*
     IT = 3,
     HR = 2,
     Finance = 2,
     Operations =1
     */
        System.out.println("Initial employess list : " + employess);

        List<String> list = employess.stream()
                .collect(
                        Collectors.groupingBy(EmployeeClass::getDepartment,
                                Collectors.counting()
                        ))
                .entrySet().stream()
                .filter(e -> e.getValue() > 2)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(list);

        //Max Salary
        Optional<EmployeeClass> max = employess.stream()
                .max(Comparator.comparingDouble(EmployeeClass::getSalary));

        System.out.println("Max Salary : " + max.get());

        //Min Salary
        Optional<EmployeeClass> min = employess.stream()
                .min(Comparator.comparingDouble(EmployeeClass::getSalary));

        System.out.println("Min Salary : " + min.get());

        //Print employee id and name and remove duplicate id and keep only latest value
        Map<Integer, String> collect = employess.stream()
                .collect(Collectors.toMap(EmployeeClass::getId,
                        EmployeeClass::getName, (existing, duplicate) -> duplicate));
        System.out.println(collect);

        //Print total salary of all employees
        Double totalSalary = employess.stream()
                .collect(Collectors.summingDouble(EmployeeClass::getSalary));
        System.out.println("Total salary of employees : " + totalSalary);

        //OR
        Double totalSalary1 = employess.stream()
                .mapToDouble(EmployeeClass::getSalary)
                .sum();
        System.out.println("Total salary of employees : " + totalSalary1);

        //Average salary of emploees
        double averageSalary = employess.stream()
                .mapToDouble(EmployeeClass::getSalary)
                .average().orElse(0.0);

        System.out.println("Average salary of employees : " + averageSalary);

        //Find the names of the top 3 highest-paid employees
        List<String> topThreeHighestSalary = employess.stream()
                .sorted(Comparator.comparing(EmployeeClass::getSalary).reversed())
                .limit(3)
                .map(EmployeeClass::getName)
                .toList();

        System.out.println("Top 3 highest salary : " + topThreeHighestSalary);

        Map<String, Long> collect1 = employess.stream()
                .filter(emp -> emp.getSalary() > 50000)
                .collect(Collectors.groupingBy(
                        EmployeeClass::getDepartment,
                        Collectors.counting()));
        System.out.println(collect1);
    }
}

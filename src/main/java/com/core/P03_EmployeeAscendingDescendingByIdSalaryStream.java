package main.java.com.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class P03_EmployeeAscendingDescendingByIdSalaryStream {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Rahul", 65000),
                new Employee("Priya", 75000),
                new Employee("Neha", 50000),
                new Employee("Amit", 45000));

        System.out.println(employees);
        //[Rahul-65000.0, Priya-75000.0, Neha-50000.0, Amit-45000.0]

        //Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary)); //Ascending by salary
        //Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary).reversed()); //Descending by salary


        List<Employee> ascendingBySalary = employees.stream()
                                                    .sorted(Comparator.comparingDouble(Employee::getSalary))
                                                    .toList();
        System.out.println("AscendingBySalary: " + ascendingBySalary);
        //AscendingBySalary: [Amit-45000.0, Neha-50000.0, Rahul-65000.0, Priya-75000.0]

        List<Employee> descendingBySalary = employees.stream()
                                                     .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                                                     .toList();
        System.out.println("DescendingBySalary: " + descendingBySalary);
        //DescendingBySalary: [Priya-75000.0, Rahul-65000.0, Neha-50000.0, Amit-45000.0]

        List<Employee> ascendingByName = employees.stream()
                                                    .sorted(Comparator.comparing(Employee::getName))
                                                    .toList();
        System.out.println("AscendingByName: " + ascendingByName);
        //AscendingByName: [Amit-45000.0, Neha-50000.0, Priya-75000.0, Rahul-65000.0]

        List<Employee> descendingByName = employees.stream()
                                                   .sorted(Comparator.comparing(Employee::getName).reversed())
                                                    .toList();
        System.out.println("DescendingByName: "+descendingByName);
        //DescendingByName: [Rahul-65000.0, Priya-75000.0, Neha-50000.0, Amit-45000.0]
    }
}

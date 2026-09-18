package main.java.com.core;

import main.java.com.java8.stream.Intermediate.EmployeeClass;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Sample {

    public static void main(String[] args) {

        List<List<String>> skills = List.of(
                List.of("Java", "Spring"),
                List.of("Kafka", "Redis"),
                List.of("Docker", "Java")
        );

        Set<String> collect = skills.stream().flatMap(List::stream).distinct().collect(Collectors.toSet());

        System.out.println(collect);

        List<Employee> employees = Arrays.asList(
                new Employee("Amit", 45000),
                new Employee("Rahul", 65000),
                new Employee("Priya", 75000),
                new Employee("Neha", 50000)
        );

        List<String> strings = employees.stream().filter(emp -> emp.getSalary() > 50000).map(emp -> emp.getName().toUpperCase()).toList();

        System.out.println(strings);

        List<EmployeeClass> employees1 = Arrays.asList(
                new EmployeeClass(1, "John", "HR", 50000),
                new EmployeeClass(2, "Jane", "IT", 70000),
                new EmployeeClass(3, "Mike", "IT", 80000),
                new EmployeeClass(4, "Sara", "Finance", 60000),
                new EmployeeClass(5, "Pane", "HR", 55000)
        );

        System.out.println(employees1);

        Map<String, List<EmployeeClass>> collect1 = employees1.stream().collect(Collectors.groupingBy(EmployeeClass::getDepartment));
        System.out.println(collect1);

    }
}

package main.java.com.java8.stream.Intermediate;

import main.java.com.core.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
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

    }
}

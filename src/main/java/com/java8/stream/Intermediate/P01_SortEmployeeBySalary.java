package main.java.com.java8.stream.Intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P01_SortEmployeeBySalary {
    public static void main(String[] args) {

        List<EmployeeClass> employees = Arrays.asList(
                new EmployeeClass(101, "John", 50000),
                new EmployeeClass(102, "Alice", 70000),
                new EmployeeClass(103, "Bob", 45000),
                new EmployeeClass(104, "David", 90000)
        );


        List<EmployeeClass> listAscending = employees.stream()
                .sorted(Comparator.comparing(EmployeeClass::getSalary))
                .toList();

        System.out.println("listAscending : " + listAscending);


        List<EmployeeClass> listDescending = employees.stream()
                .sorted(Comparator.comparing(EmployeeClass::getSalary).reversed())
                .toList();

        System.out.println("listDescending : " + listDescending);
    }
}

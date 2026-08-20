package main.java.com.java8.stream.Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class P06_GroupByDepartment {

    public static void main(String[] args) {

        List<EmployeeClass> employees = Arrays.asList(
                new EmployeeClass(1, "John", "HR", 50000),
                new EmployeeClass(2, "Jane", "IT", 70000),
                new EmployeeClass(3, "Mike", "IT", 80000),
                new EmployeeClass(4, "Sara", "Finance", 60000),
                new EmployeeClass(5, "Pane", "HR", 55000)
        );


        /*Finance : 60000.0
         * HR : 52500.0
         * IT : 75000.0
         * */

        Map<String, Double> collect = employees.stream()
                .collect(Collectors.groupingBy(EmployeeClass::getDepartment, Collectors.averagingDouble(EmployeeClass::getSalary)));

        System.out.println(collect);

    }
}

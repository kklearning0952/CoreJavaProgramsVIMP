package main.java.com.java8.stream.Intermediate;

import java.util.*;
import java.util.stream.Collectors;

public class P07_HighestPaidEmployeeSalaryByDept {

    //Find the highest-paid employee salary in each department

    public static void main(String[] args) {
        List<EmployeeClass> employees = Arrays.asList(
                new EmployeeClass(1, "John", "HR", 50000),
                new EmployeeClass(2, "Jane", "IT", 70000),
                new EmployeeClass(3, "Mike", "IT", 80000),
                new EmployeeClass(4, "Sara", "Finance", 60000),
                new EmployeeClass(4, "Paul", "HR", 55000)
        );

        /*
        Finance -Sara- 60000
        IT -Mike- 80000
        HR -Paul-55000
        */

        Map<String, Optional<EmployeeClass>> collect = employees.stream()
                .collect(Collectors.groupingBy(
                        EmployeeClass::getDepartment,
                        Collectors.maxBy(Comparator.comparing(EmployeeClass::getSalary))
                ));

        System.out.println(collect);


        //Convert to map where it=key and name=value
        Map<Integer, String> map = employees.stream()
//                .collect(Collectors.toMap(EmployeeClass::getId, EmployeeClass::getName)); OR
                .collect(Collectors.toMap(e -> e.getId(), e -> e.getName()));
        //.collect(Collectors.toMap(e -> e.getId(), e -> e.getName(),(oldvalue,newvalue)->newvalue)); If duplicates id in employee then use newvalue or else it will IllegalStateException for duplicate keys.
        System.out.println(map);



    }
}


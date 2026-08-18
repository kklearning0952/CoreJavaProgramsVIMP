package main.java.com.java8.stream.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class P01_FindDistinctElements {

    //Remove Duplicates elements from list
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 2, 8, 2, 3, 5, 9, 3);
        //5,2,8,3,9

        //1. Convert List to Set
        Set<Integer> distinctList1 = new HashSet<>(numbers);
        System.out.println(distinctList1);

        //2. Stream [Direct convert List to set using stream]
        Set<Integer> distinctList2 = numbers
                .stream()
                .collect(Collectors.toSet());

        System.out.println(distinctList2);


        //3. Using stream [distinct() -> list()]
        List<Integer> distinctList3 = numbers
                .stream()
                .distinct()
                .toList();

        System.out.println(distinctList3);
    }
}

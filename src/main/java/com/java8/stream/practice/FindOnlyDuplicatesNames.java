package main.java.com.java8.stream.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOnlyDuplicatesNames {

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Kiran", "Amit", "Kiran", "Rahul", "Amit", "Vijay");

        //1. Using For and map
        Map<String, Integer> map = new HashMap<>();

        for (String s : names) {
            System.out.println(map.put(s, map.getOrDefault(s, 0) + 1));
        }

        System.out.println("Final Map : " + map);

        for (Map.Entry m : map.entrySet()) {
            if ((int) m.getValue() > 1) {
                System.out.println(m.getKey() + "---" + m.getValue());
            }
        }

        //2. Write Java Stream code to find only the duplicate names
        List<String> strings = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(strings);


    }
}

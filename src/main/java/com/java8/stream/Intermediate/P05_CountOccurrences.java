package main.java.com.java8.stream.Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P05_CountOccurrences {

    public static void main(String[] args) {


        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        //apple -3
        //banana -2
        //orange-1
        Map<String, Long> map = items.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);
    }
}

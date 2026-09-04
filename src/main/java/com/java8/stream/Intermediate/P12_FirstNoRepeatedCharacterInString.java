package main.java.com.java8.stream.Intermediate;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P12_FirstNoRepeatedCharacterInString {

    public static void main(String[] args) {
        String input = "swiss";


        Optional<Map.Entry<Character, Long>> first = input.chars()
                .mapToObj(ch -> (char) ch).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst();

        System.out.println(first);
    }
}

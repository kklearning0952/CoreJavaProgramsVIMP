package main.java.com.java8.stream.Intermediate;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P11_MostFrequestCharacterFromString {
    public static void main(String[] args) {

        String input = "banana";

        Map.Entry<Character, Long> characterLongEntry = input.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();

        System.out.println(characterLongEntry);
    }
}

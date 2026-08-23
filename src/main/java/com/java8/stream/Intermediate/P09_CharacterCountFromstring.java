package main.java.com.java8.stream.Intermediate;

import java.util.Map;
import java.util.stream.Collectors;

public class P09_CharacterCountFromstring {

    public static void main(String[] args) {
        String name="programming";

        Map<Character, Long> collect = name.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(
                        ch -> ch, Collectors.counting()
                ));

        System.out.println(collect);
    }
}

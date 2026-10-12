package main.java.com.interview.strings;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P05_CharacterFrequencyStream {
    public static void main(String[] args) {

        String name = "ABBCCCDDDDEEEEE";


        String finalString = name.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .map(map -> map.getKey() + String.valueOf(map.getValue()))
                .collect(Collectors.joining());


        System.out.println("Charcter Frequency String : " + finalString);
    }
}

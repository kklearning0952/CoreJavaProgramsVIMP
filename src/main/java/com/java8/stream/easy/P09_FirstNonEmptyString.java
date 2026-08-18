package main.java.com.java8.stream.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class P09_FirstNonEmptyString {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("", "", "Hello", "World", "");

        Optional<String> findFirst = strings.stream()
                .filter(s -> !s.isEmpty())
                .findFirst();

        System.out.println(findFirst.get());
    }
}

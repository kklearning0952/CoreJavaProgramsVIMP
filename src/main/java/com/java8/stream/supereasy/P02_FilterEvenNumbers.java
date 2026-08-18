package main.java.com.java8.stream.supereasy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P02_FilterEvenNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = numbers
                .stream()
                .filter(n -> n % 2 == 0)
                //.collect(Collectors.toList());
                .toList();

        System.out.println(collect);

    }
}


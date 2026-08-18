package main.java.com.java8.stream.supereasy;

import java.util.Arrays;
import java.util.List;

public class P04_SquareEvenNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .toList();
                //.collect(Collectors.toList());

        System.out.println(result);
    }
}

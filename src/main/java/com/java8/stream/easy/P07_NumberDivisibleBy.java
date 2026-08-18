package main.java.com.java8.stream.easy;

import java.util.Arrays;
import java.util.List;

public class P07_NumberDivisibleBy {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 7, 9, 10, 14);

        boolean b = numbers.stream()
                .anyMatch(n -> n % 3 == 0);

        System.out.println("Any number is divisible by 3 : " + b);
    }
}

package main.java.com.java8.stream.easy;

import java.util.Arrays;
import java.util.List;

public class P06_AllPositiveExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 10, 3, 8, -2);

        boolean isAllPositive = numbers.stream()
                .allMatch(n -> n > 0);

        System.out.println("isAllPositive : "+isAllPositive);
    }
}

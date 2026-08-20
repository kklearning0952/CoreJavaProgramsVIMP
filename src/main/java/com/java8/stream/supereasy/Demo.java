package main.java.com.java8.stream.supereasy;

import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> numbers =
                List.of(10, 20, 20, 30, 40, 50);

        //Get unique numbers greater than 20, multiply each by 2,
        // sort them in descending order, and collect them into a List.

        List<Integer> list = numbers.stream()
                .distinct()
                .filter(n -> n > 20)
                .map(n -> n * 2)
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("list : " + list);

    }
}

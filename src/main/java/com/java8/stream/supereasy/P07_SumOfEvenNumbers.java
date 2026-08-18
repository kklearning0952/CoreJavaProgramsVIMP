package main.java.com.java8.stream.supereasy;

import java.util.Arrays;
import java.util.List;

public class P07_SumOfEvenNumbers {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Integer result = list.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, (a, b) -> a + b);

        System.out.println("result : " + result);
    }
}

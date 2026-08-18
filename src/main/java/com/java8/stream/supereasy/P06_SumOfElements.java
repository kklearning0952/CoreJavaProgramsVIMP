package main.java.com.java8.stream.supereasy;

import java.util.Arrays;
import java.util.List;

public class P06_SumOfElements {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Integer reduceSum = list.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum : " + reduceSum);

        Integer reduceMul = list.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("multiplication : "+reduceMul);


    }
}

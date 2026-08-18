package main.java.com.java8.stream.supereasy;

import java.util.Arrays;
import java.util.List;

public class P08_MaxNumber {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 10, 2, 8, 20);

        Integer result = list.stream()
                .reduce(0, (a, b) -> Integer.max(a, b));

        System.out.println("Max number is : " + result);
    }
}

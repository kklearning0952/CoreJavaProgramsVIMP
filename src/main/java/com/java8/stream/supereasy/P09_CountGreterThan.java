package main.java.com.java8.stream.supereasy;

import java.util.Arrays;
import java.util.List;

public class P09_CountGreterThan {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 6, 3, 8, 10, 1);

        long count = list.stream()
                .filter(n -> n > 5)
                .count();

        System.out.println(count);


    }
}

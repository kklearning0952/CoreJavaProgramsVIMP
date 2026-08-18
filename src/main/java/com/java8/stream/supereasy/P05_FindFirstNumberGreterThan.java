package main.java.com.java8.stream.supereasy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class P05_FindFirstNumberGreterThan {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 7, 12, 5, 11, 20);
        Optional<Integer> first = list.stream()
                .filter(n -> n > 10)//12,11,20
                .sorted()//11,12,20
                .findFirst();

        System.out.println(first.get());
    }
}

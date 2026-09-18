package main.java.com.java8.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PrintMissingNumbersFromList {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 5, 15, 20);

        List<Integer> missingNumberss = IntStream.rangeClosed(1, 20).filter(no -> !list.contains(no)).boxed().toList();

        System.out.println("Missing Numbers : "+missingNumberss);
    }
}

package main.java.com.java8.stream.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P05_JoinStringExample {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple", "Banana", "Mango", "Orange");

        String collect = fruits.stream()
                .collect(Collectors.joining("--", "[", "]"));

        System.out.println(collect);


    }
}

package main.java.com.java8.stream.easy;

import java.util.Arrays;
import java.util.List;

public class P04_CountStartingWithA {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple", "Banana", "Avacado", "Mango", "Apricot");

        long count = fruits
                .stream()
                .filter(name -> name.startsWith("A"))
                .count();

        System.out.println("Cound starts with A : " + count);


    }
}

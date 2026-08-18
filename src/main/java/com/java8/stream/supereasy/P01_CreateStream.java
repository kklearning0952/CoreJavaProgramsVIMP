package main.java.com.java8.stream.supereasy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class P01_CreateStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob");
        System.out.println(names);

        //1. List -> Stream
        Stream<String> stream = names.stream();
        System.out.println(stream);

        //2. Array -> Stream
        String[] arr = {"Java", "Python", "C++"};
        Stream<String> streamed = Arrays.stream(arr);


        //3. Stream Of
        Stream<Integer> integerStream = Stream.of(1, 2, 3);


        //4. stream generate
        Stream<Double> limit = Stream.generate(Math::random).limit(5);
    }
}

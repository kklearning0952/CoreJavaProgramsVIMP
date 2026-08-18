package main.java.com.core;

import java.util.List;

public class StreamDemo {

    public static void main(String[] args) {
        List<Integer> list=List.of(50,10,40,20,30);

        //Values greter than 20
        list.stream().filter(n -> n>20)
                .forEach(System.out::println);
    }
}

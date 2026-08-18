package main.java.com.java8.stream.easy;

import java.util.Arrays;
import java.util.List;

public class P08_FlattenExample {

    public static void main(String[] args) {

        List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8));

        //Single list 1,2,3,4,5,6
        List<Integer> list = listOfLists.stream()
                .flatMap(List::stream)//or .flatMap(list1 -> list1.stream())
                .toList();

        System.out.println(list);


    }
}

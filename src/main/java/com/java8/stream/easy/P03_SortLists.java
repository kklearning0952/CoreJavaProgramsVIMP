package main.java.com.java8.stream.easy;

import java.util.*;

public class P03_SortLists {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 1, 8, 3, 2, 10,1,2,3);

        //1. Sort [converting list to TreeSet]
        Set<Integer> numbersAscending = new TreeSet<>(numbers);

        System.out.println("numbersAscending : " + numbersAscending);

        //2. Sorting Ascending using stream
        List<Integer> listStreamAscending = numbers.stream()
                .distinct()
                .sorted()
                .toList();

        System.out.println("listStreamAscending : " + listStreamAscending);

        List<Integer> listStreamDescending = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("listStreamDescending : " + listStreamDescending);

    }
}

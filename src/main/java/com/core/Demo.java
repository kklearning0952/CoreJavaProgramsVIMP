package main.java.com.core;

import java.util.*;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println("set" + set);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(30);
        linkedHashSet.add(20);
        linkedHashSet.add(10);
        linkedHashSet.add(30);
        System.out.println("linkedHashSet" + linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);

        System.out.println("treeSet" + treeSet);

        List<Integer> numbers =
                List.of(10, 15, 20, 25, 30, 35, 40);

        //Get even numbers, multiply them by 2, sort them in descending order, take only the first 3, and store them in a new list.
        Stream<Integer> limit = numbers.stream().filter(n -> n % 2 == 0).map(n -> n * 2).sorted(Comparator.reverseOrder()).limit(3);

        System.out.println(limit.toList());

    }
}

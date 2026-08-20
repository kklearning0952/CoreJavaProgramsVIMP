package main.java.com.core;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

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

    }
}

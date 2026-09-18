package main.java.com.core;

import java.util.ArrayList;
import java.util.List;

public class P01_StringToCollection {

    public static void main(String[] args) {
        String name = "Kiran";
        List<Character> list = new ArrayList<>();

        for (char ch : name.toCharArray()) {
            list.add(ch);
        }

        System.out.println(list);

        List<Character> list1 = name.chars().mapToObj(ch -> (char) ch).toList();

        System.out.println(list1);
    }
}

package main.java.com.core;

import java.util.ArrayList;
import java.util.Collections;

public class P02_ArrayListSortingUsingComparable {
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();
        name.add("Kiran");
        name.add("Sagar");
        name.add("Arjun");
        name.add("Bhimsen");

        //Collections.sort(name);//Ascending order
        Collections.sort(name,Collections.reverseOrder());//DescendingOrder

        System.out.println("Names: " + name);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(10);
        numbers.add(50);
        numbers.add(30);
        numbers.add(80);

        //Collections.sort(numbers);//Ascending order
        Collections.sort(numbers, Collections.reverseOrder());//Descending Order

        System.out.println("Numbers: " + numbers);

    }
}

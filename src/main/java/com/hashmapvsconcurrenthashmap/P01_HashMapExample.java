package main.java.com.hashmapvsconcurrenthashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P01_HashMapExample {

    public static void main(String[] args) throws InterruptedException {

        Map<String, Integer> balanceMap = Collections.synchronizedMap(new HashMap<>());


        balanceMap.put("Kiran", 0);

        Runnable task = () -> {
            for (int i = 1; i <= 1000; i++) {
                balanceMap.put("Kiran", balanceMap.get("Kiran") + 1);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(balanceMap.get("Kiran"));

        Map<Integer, String> map = new HashMap<>();

        map.put(101, "Kiran");
        map.put(102, "Sagar");
        map.put(103, "Arjun");
        map.put(104, "Soma");

        System.out.println("Map : " + map);

        //Print values using for loop
        for (String name : map.values()) {
            System.out.println(name);
        }

        //Print values using forEach
        System.out.println("Using forEach() :");
        map.forEach((Integer key, String value) -> System.out.print(key + "-" + value+", "));


        //Print values using stream

        System.out.println("Using Stream API");
        map.values().stream().forEach(System.out::println);

    }
}

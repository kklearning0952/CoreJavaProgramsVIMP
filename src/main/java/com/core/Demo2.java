package main.java.com.core;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo2 {

    public static void main(String[] args) {
        String str = "programming";

        Map<Character, Long> collect = str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);

        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

        System.out.println(map.putIfAbsent("TXN1", "PROCESSING")); //null
        System.out.println(map.putIfAbsent("TXN1", "COMPLETED")); //PROCESSING
        System.out.println(map.putIfAbsent("TXN1", "KK")); //COMPLETED
        System.out.println(map);

        // Creates a pool with 2 worker threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(() -> {
            System.out.println("Task 1 running by: "
                    + Thread.currentThread().getName());
        });

        executor.submit(() -> {
            System.out.println("Task 2 running by: "
                    + Thread.currentThread().getName());
        });

        executor.submit(() -> {
            System.out.println("Task 3 running by: "
                    + Thread.currentThread().getName());
        });

        // Stops accepting new tasks; running tasks finish first
        executor.shutdown();

        String name="SUCCESS";
        Optional<Map.Entry<Character, Long>> first = name.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(map5 -> map5.getValue() == 1).findFirst();


    }
}

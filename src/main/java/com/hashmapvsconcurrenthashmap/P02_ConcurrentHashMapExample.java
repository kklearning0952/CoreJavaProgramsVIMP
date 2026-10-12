package main.java.com.hashmapvsconcurrenthashmap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class P02_ConcurrentHashMapExample {
    public static void main(String[] args) throws InterruptedException {

        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("Kiran", 0);

        Runnable task = () -> {
            for (int i=1;i<=1000;i++)
            {
                map.compute("Kiran",(String key,Integer value) -> value+1);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(map.get("Kiran"));
    }
}

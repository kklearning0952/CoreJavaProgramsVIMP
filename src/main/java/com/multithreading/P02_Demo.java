package main.java.com.multithreading;


public class P02_Demo {

    public static void main(String[] args) throws InterruptedException {
        Counters counter = new Counters();

        Thread t1 = new Thread(
                () -> {
                    for (int i = 0; i < 1000; i++) {
                        counter.increment();
                    }
                }
        );

        Thread t2 = new Thread(
                () -> {
                    for (int i = 0; i < 1000; i++) {
                        counter.increment();
                    }
                }
        );

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.count);
    }
}

class Counters {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}

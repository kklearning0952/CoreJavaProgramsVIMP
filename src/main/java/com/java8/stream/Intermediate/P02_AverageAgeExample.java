package main.java.com.java8.stream.Intermediate;

import java.util.Arrays;
import java.util.List;

public class P02_AverageAgeExample {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 28),
                new Person("David", 35)
        );

        double average = people.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0.0);

        System.out.println("average age : " + average);
    }
}

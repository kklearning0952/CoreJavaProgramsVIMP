package main.java.com.java8.stream.practice;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

public class CustomNameValidationExample {

    @Retention(RetentionPolicy.RUNTIME)
    @interface Name {
    }

    static class Employee {

        @Name
        private String name;

        Employee(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) throws IllegalAccessException {

        Employee employee1 = new Employee("Kiran123");
        Employee employee2 = new Employee("");
        Employee employee3 = new Employee("Kiran@123");

        validate(employee1);
        validate(employee2);
        validate(employee3);
    }

    static void validate(Object object) throws IllegalAccessException {

        for (Field field : object.getClass().getDeclaredFields()) {

            if (field.isAnnotationPresent(Name.class)) {
                field.setAccessible(true);

                String value = (String) field.get(object);

                // Valid if blank OR only letters and numbers
                boolean isValid = value != null &&
                        (value.isBlank() || value.matches("[a-zA-Z0-9]+"));

                if (isValid) {
                    System.out.println(value + " -> Valid name");
                } else {
                    System.out.println(value + " -> Invalid name");
                }
            }
        }
    }
}
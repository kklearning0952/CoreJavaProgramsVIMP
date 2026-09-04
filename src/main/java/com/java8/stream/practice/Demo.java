package main.java.com.java8.stream.practice;

public class Demo {

    public static void main(String[] args) {
        String input = "aaabbcc";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            int count = 1;

            while (i < input.length() - 1
                    && input.charAt(i) == input.charAt(i + 1)) {
                count++;
                i++;
            }

            result.append(input.charAt(i)).append(count);
        }

        System.out.println(result); // a3b2c2

    }
}


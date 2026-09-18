package main.java.com.java8.stream.practice;

public class CheckVowelsAndConvertCharcterToUpperCaseOrLowercase {

    public static void main(String[] args) {
        String name = "programming";
        String finalName = "";

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if ("aeiou".indexOf(Character.toLowerCase(ch)) != -1) {
                finalName += Character.isLowerCase(ch) ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
            } else {
                finalName += ch;
            }
        }

        System.out.println("final String is : " + finalName);
    }
}

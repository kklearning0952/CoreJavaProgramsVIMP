package main.java.com.interview.strings;

import java.util.Scanner;

public class P02_ReverseEachWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence to reverse the characters of each word: ");

        String sentence = sc.nextLine();
        System.out.println("Original sentence is : " + sentence);

        //1. Split to array by space and then reverse each word
        String[] wordsArray = sentence.split(" ");

        for (int i = 0; i < wordsArray.length - 1; i++) {
            String word = wordsArray[i];
            for (int j = word.length() - 1; j >= 0; j--) {
                System.out.print(word.charAt(j));
            }
            System.out.print(" ");
        }
    }
}

package main.java.com.interview.strings;

import java.util.HashSet;
import java.util.Scanner;

public class P04_FindDuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> set = new HashSet<>();
        System.out.print("Enter the String : ");

        String name = sc.nextLine();
        System.out.println("Original String is : " + name);


        for (int i = 0; i < name.length(); i++) {
            for (int j = i + 1; j < name.length(); j++) {
                if (name.charAt(i) == name.charAt(j)) {
                    set.add(name.charAt(i));
                }
            }
        }

        System.out.println("Duplicates characters are : "+set);
    }
}

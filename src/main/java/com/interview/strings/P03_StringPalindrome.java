package main.java.com.interview.strings;

import java.util.Scanner;

public class P03_StringPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String that you want to check palindrome: ");

        String sampleString = sc.nextLine();

        String reverseString = new StringBuffer(sampleString).reverse().toString();
        System.out.println("String is palindrome? : " + sampleString.equals(reverseString));


    }
}

package main.java.com.interview.strings;

import java.util.Scanner;

public class P01_ReverseString {

    public static void main(String[] args) {

        // String        → Immutable(can't modify) & Thread-Safe
        // StringBuffer  → Mutable(can modify) & Thread-Safe
        // StringBuilder → Mutable(can modify) & Not Thread-Safe, Fast

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String that you want to reverse it : ");
        String name = sc.nextLine();
        System.out.println("Original String is : " + name);

        //1. Using For Loop
        System.out.print("\nReversing the string using For loop : ");
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }

        //2. Using StringBuffer reverse() method
        StringBuffer stringBuffer = new StringBuffer(name);
        System.out.println("\nReversing the string using StringBuffer : " + stringBuffer.reverse());

        //3. Using StringBuilder reverse() method
        StringBuilder stringBuilder = new StringBuilder(name);
        System.out.println("\nReversing the string using StringBuilder : " + stringBuilder.reverse());
    }
}

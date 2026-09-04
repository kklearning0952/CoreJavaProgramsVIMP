package main.java.com.java8.stream.easy;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P11_DuplicateNumberCheck {
    public static void main(String[] args) {
        //Input: nums2 = [1,2,3,4]
        //an integer array nums, return true if any value appears at least twice in the array
        int[] nums2 = {1,2,3,1};

        boolean b = Arrays.stream(nums2)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values()
                .stream()
                .anyMatch(n -> n > 1);

        System.out.println(b);


    }
}

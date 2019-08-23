package com.praveen.arrays.rearrangements;

import java.util.Arrays;

/*
https://www.geeksforgeeks.org/given-an-array-of-numbers-arrange-the-numbers-to-form-the-biggest-number/

Given an array of numbers, arrange them in a way that yields the largest value.
 */
public class GreatestNumberWithGivenNumbers
{
    public static void main(String[] args)
    {
        Integer[] arr = new Integer[]{54, 546, 548, 60};
        printGreatestNumber(arr);
        Integer[] arr2 = new Integer[] {1, 34, 3, 98, 9, 76, 45, 4};
        printGreatestNumber(arr2);
    }

    private static void printGreatestNumber(Integer[] arr)
    {
        Arrays.sort(arr, (a, b) ->
        {
            String as = a.toString();
            String bs = b.toString();
            return Integer.compare(Integer.valueOf(as+bs), Integer.valueOf(bs+as));
        });

        for (int i = arr.length - 1; i >= 0; i--)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}

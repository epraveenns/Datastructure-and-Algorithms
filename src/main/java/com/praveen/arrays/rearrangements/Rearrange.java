package com.praveen.arrays.rearrangements;

import java.util.Arrays;

/*
https://www.geeksforgeeks.org/rearrange-array-arri/
Rearrange an array such that arr[i] = i
Given an array of elements of length N, ranging from 0 to N – 1. All elements may not be present in the array.
If element is not present then there will be -1 present in the array.
Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.
 */
public class Rearrange
{
    public static void main(String[] args)
    {
        int[] arr = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8,
                11, 10, 9, 5, 13, 16, 2, 14, 17, 4};

        int i = 0;
        while (i<arr.length)
        {
            if(arr[i] == -1 || arr[i] == i)
            {
                i++;
            }
            else
            {
                int value = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = value;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

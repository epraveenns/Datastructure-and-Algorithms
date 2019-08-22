package com.praveen.arrays.rearrangements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
https://www.geeksforgeeks.org/move-zeroes-end-array-set-2-using-single-traversal/
Move all zeroes to end of array | Set-2 (Using single traversal)
Given an array of n numbers. The problem is to move all the 0’s to the end of the array while maintaining
the order of the other elements. Only single traversal of the array is required.
 */
public class MoveZerosToEnd
{
    public static void main(String[] args)
    {
        int arr[] = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        move(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void move(int[] arr)
    {
        int i = 0;
        while(i<arr.length && arr[i] != 0)
        {
            i++;
        }
        int j = i;

        while (j<arr.length && i<arr.length)
        {
            while (j<arr.length && arr[j] == 0)
            {
                j++;
            }
            while(i<arr.length && arr[i] != 0)
            {
                i++;
            }
            if(j<arr.length && i<arr.length)
            {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }
}

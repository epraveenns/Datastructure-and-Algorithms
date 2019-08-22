package com.praveen.arrays.rearrangements;

import java.util.Arrays;

/*
https://www.geeksforgeeks.org/rearrange-array-order-smallest-largest-2nd-smallest-2nd-largest/

Rearrange an array in order – smallest, largest, 2nd smallest, 2nd largest, ..

 */
public class RearrangeArrayLikeSmallestLargestSmallest
{
    public static void main(String[] args)
    {
        int[] arr = {5, 8, 1, 4, 2, 9, 3, 7, 6};

        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i=i+2)
        {
            reverse(arr, i, arr.length-2);
            reverse(arr,i,arr.length-1);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int j, int k)
    {
        while (j<k)
        {
            int temp = arr[j];
            arr[j] = arr[k];
            arr[k] = temp;
            j++;
            k--;
        }
    }
}
//1 2 3 4 5 6
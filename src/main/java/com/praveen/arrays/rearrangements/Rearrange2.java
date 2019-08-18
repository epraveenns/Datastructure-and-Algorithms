package com.praveen.arrays.rearrangements;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
https://www.geeksforgeeks.org/rearrange-array-arri-arrj-even-arri/

Rearrange array such that arr[i] >= arr[j] if i is even and arr[i]<=arr[j] if i is odd and j < i

 */
public class Rearrange2
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 1, 4, 5, 6, 8, 8};
        int[] copiedArr = new int[arr.length];
        System.arraycopy(arr,0,copiedArr,0,arr.length);
        Arrays.sort(copiedArr);
        rearrange(arr, copiedArr);
    }

    private static void rearrange(int[] arr, int[] copiedArr)
    {
        int size = arr.length;
        int mid = size/2;

        if(size % 2 == 0)
        {
            mid--;
        }
        int i = mid;
        int j=i+1;

        int pointer = 0;

        while (i>=0 || j<size)
        {
            if(i >= 0)
            {
                arr[pointer] = copiedArr[i];
            }
            i--;
            pointer++;
            if(j < size)
            {
                arr[pointer] = copiedArr[j];
            }
            j++;
            pointer++;
        }
        System.out.println(Arrays.toString(arr));

    }
}

package com.praveen.arrays.rearrangements;

import java.util.Arrays;

/*
https://www.geeksforgeeks.org/rearrange-array-such-that-even-positioned-are-greater-than-odd/

Rearrange array such that even positioned are greater than odd

 */
public class MaxEvenPositions
{


    public static void main(String[] args)
    {
        int[] arr = {87,78,16,94,36,87,93,50,22,63,28,91,60,64,27,41,27,73,37,12,69,68,30,83,31,63,24,68,36,30,3,23,59,70,
                68,94,57,12,43,30,74,22,20,85,38,99,25,16,71,14,27,92,81,57,74,63,71,97,82,6,26,85,28,37,6,47,30,14,58,25,
                96,83,46,15,68,35,65,44,51,88,9,77,79,89};

        for (int i = arr.length - 1; i > 0; i--)
        {
            if(i%2 == 0)
            {
                if(arr[i] < arr[i-1])
                {
                    swap(arr,i,i-1);
                }
            }
            else
            {
                if(arr[i] > arr[i-1])
                {
                    swap(arr,i,i-1);
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

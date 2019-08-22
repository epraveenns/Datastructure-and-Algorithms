package com.praveen.arrays.rearrangements;

import java.util.Arrays;

/*
https://www.geeksforgeeks.org/rearrange-array-alternating-positive-negative-items-o1-extra-space/

Rearrange array in alternating positive & negative items with O(1) extra space

Given an array of positive and negative numbers, arrange them in an alternate fashion such that every positive number is
 followed by negative and vice-versa maintaining the order of appearance.
Number of positive and negative numbers need not be equal. If there are more positive numbers they appear at the end of
the array. If there are more negative numbers, they too appear in the end of the array.
 */
public class PositiveNegativeRearrange
{
    public static void main(String[] args)
    {
        int arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        rearrange(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void rearrange(int[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            if( (i%2 == 0 && arr[i] >= 0) || (i%2 !=0 && arr[i] < 0))
            {
                if(arr[i] >= 0)
                {
                    for (int j = i+1; j < arr.length; j++)
                    {
                        if(arr[j] < 0)
                        {
                            rotate(arr,i,j);
                            break;
                        }
                    }
                }
                else
                {
                    for (int j = i+1; j < arr.length; j++)
                    {
                        if(arr[j] >= 0)
                        {
                            rotate(arr,i,j);
                            break;
                        }
                    }
                }
            }
        }
    }

    private static void rotate(int[] arr, int i, int j)
    {
        reverse(arr,i,j-1);
        reverse(arr,i,j);
    }

    private static void reverse(int[] arr, int i, int j)
    {
        int ii = i;
        int jj = j;
        while (ii < jj)
        {
            int temp = arr[ii];
            arr[ii] = arr[jj];
            arr[jj] = temp;
            ii++;
            jj--;
        }
    }
}

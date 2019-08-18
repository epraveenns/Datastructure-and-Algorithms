package com.praveen.arrays.rotations;

import java.util.Arrays;

/*
https://www.geeksforgeeks.org/find-maximum-value-of-sum-iarri-with-only-rotations-on-given-array-allowed/
Find maximum value of Sum( i*arr[i]) with only rotations on given array allowed

 */
public class MaxSumInRotatedArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[] {1, 20, 2, 10};
        int arraySum = Arrays.stream(arr).reduce(0,(a,b) -> a+b);   //calculate sum of all elements in the array

        int maxSum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            maxSum = maxSum + (i * arr[i]);
        }

        int prevRotationSum = maxSum;

        for (int i = 1; i < arr.length; i++)
        {
            int currentRotationSum = prevRotationSum - arraySum + (arr.length)*arr[i-1];
            if(currentRotationSum > maxSum)
            {
                maxSum = currentRotationSum;
            }
            prevRotationSum = currentRotationSum;
        }
        System.out.println(maxSum);
    }
}

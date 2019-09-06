package com.praveen.arrays.optimization;

import java.util.Arrays;

/*
Given an array, print the length of longest increasing subsequence at each element

For example,
Array a[] = {2, 1, 3, 1, 6, 2}
Output -> {1, 1, 2, 2, 3, 3}

Explanation:
1) At 2, LIS = {2}. Length = 1
2) At 1, LIS = {1}. Length = 1
3) At 3, LIS = {2,3} or {1,3}. Length = 2
4) At 1, LIS = {1,1}. Length = 2
5) At 6, LIS = {2,3,6} or {1,1,6}. Length = 3
6) At 2, LIS = {1,1,2}. Length = 3
 */
public class LengthOfLargestIncreasingSubsequenceAtEveryElement
{
    public static void main(String[] args)
    {
        int[] arr = {2, 1, 3, 1, 6, 2};

        int[] LIS = findLISatEveryElement(arr);

        System.out.println(Arrays.toString(LIS));
    }

    private static int[] findLISatEveryElement(int[] arr)
    {
        int[] lis = new int[arr.length];
        for (int i=0; i<arr.length; i++)
        {
            int currentElement = arr[i];
            int maxLIS = 0;
            for(int j=i-1; j>=0; j--)
            {
                if(arr[j] <= currentElement && lis[j] > maxLIS)
                {
                    maxLIS = lis[j];
                }
            }
            lis[i] = maxLIS+1;
        }
        return lis;
    }
}

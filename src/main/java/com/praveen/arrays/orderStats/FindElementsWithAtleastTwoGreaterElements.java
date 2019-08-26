package com.praveen.arrays.orderStats;

/*
https://www.geeksforgeeks.org/find-elements-array-least-two-greater-elements/

Find all elements in array which have at-least two greater elements
Given an array of n distinct elements, the task is to find all elements in array which have at-least two greater
elements than themselves.

 */

public class FindElementsWithAtleastTwoGreaterElements
{
    public static void main(String[] args)
    {
        int[] arr = {7, -2, 3, 4, 9, -1};

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++)
        {
            int value = arr[i];

            if(value > max1)
            {
                if(max2 != Integer.MIN_VALUE)
                {
                    System.out.println(max2);
                }
                max2 = max1;
                max1 = value;
            }
            else if(value > max2)
            {
                if(max2 != Integer.MIN_VALUE)
                {
                    System.out.println(max2);
                }
                max2 = value;
            }
            else
            {
                System.out.println(value);
            }
        }
    }
}

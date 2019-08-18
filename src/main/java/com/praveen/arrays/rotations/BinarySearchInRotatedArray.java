package com.praveen.arrays.rotations;

import java.util.Arrays;


/*
https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
 */
public class BinarySearchInRotatedArray
{

    public static void main(String[] args)
    {
        int[] arr = new int[] { 3,4,5,1,2};
        int search = 2;
        int midPoint = findMidPoint(arr, 0, arr.length - 1);

        if (midPoint == -1)
        {
            System.out.println(binarySearch(arr,0,arr.length-1,search) );
        }
        else if (search == arr[midPoint])
        {
            System.out.println(midPoint);
        }
        else if (search >= arr[midPoint+1] && search <= arr[arr.length-1])
        {
            System.out.println(binarySearch(arr,midPoint+1,arr.length-1,search) );
        }
        else
        {
            System.out.println(binarySearch(arr,0,midPoint-1,search) );
        }

    }

    private static int binarySearch(int[] arr, int start, int end, int search)
    {
        if(start > end)
        {
            return -1;
        }
        int mid = (start+end)/2;
        if (arr[mid] == search)
        {
            return mid;
        }
        else if (arr[mid]<search)
        {
            return binarySearch(arr,mid+1,end,search);
        }
        else
        {
            return binarySearch(arr,start,mid-1,search);
        }
    }

    private static int findMidPoint(int[] arr, int start, int end)
    {
        if (end < start)
            return -1;
        if (end==start)
            return start;

        int mid = (start+end) /2;
        if(mid < end && arr[mid] > arr[mid+1])
        {
            return mid;
        }
        if(mid > start && arr[mid-1] > arr[mid])
        {
            return mid-1;
        }
        if (arr[mid] < arr[start])
        {
            return findMidPoint(arr, start, mid-1);
        }
        return findMidPoint(arr, mid+1, end);
    }
}

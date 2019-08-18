package com.praveen.arrays.rotations;

import java.util.Arrays;

/*
https://www.geeksforgeeks.org/array-rotation/
 */
public class ArrayRotation
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        rotate(arr, 3, arr.length);
        System.out.println(Arrays.toString(arr));

        arr = new int[]{1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        rotateWithReversal(arr,3,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void rotate(int[] arr, int d, int n)
    {
        int[] temp = new int[d];
        System.arraycopy(arr,0,temp,0,d);       //time complexity -> O(d) for copying d elements to temp
        System.arraycopy(arr,d,arr,0, n-d);     //time complexity -> O(n-d) for shifting n-d elements within array
        System.arraycopy(temp,0,arr,n-d,d);    //time complexity -> O(d) for copying d elements from temp

        //total time complexity -> O(d + n - d + d) = O(n + d) = O(n)
        //total space complexity -> O(d) for creating temp array
    }

    private static void rotateWithReversal(int[] arr, int d, int n)
    {
        reverse(arr, 0, d-1);
        reverse(arr,d, n-1);
        reverse(arr, 0, n-1);
    }

    private static void reverse(int[] arr, int start, int end)
    {
        int temp;
        for (int i = start; i <= (start+end) /2; i++)
        {
            temp = arr[i];
            arr[i] = arr[start+end-i];
            arr[start+end-i] = temp;
        }
    }
}

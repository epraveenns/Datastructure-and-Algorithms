package com.praveen.arrays.orderStats;

/*
https://www.geeksforgeeks.org/kth-smallestlargest-element-unsorted-array/

Given an array and a number k where k is smaller than size of array, we need to find the k’th smallest element in the
given array. It is given that all array elements are distinct.


 */
public class kthSmallestElement
{
    public static void main(String[] args)
    {
        int arr[] = {7, 10, 4, 3, 20, 15};
        int k = 5;
        MaxHeap maxHeap = new MaxHeap(arr, k);
        for (int i = k; i < arr.length; i++)
        {
            if (maxHeap.getMax() > arr[i])
            {
                maxHeap.array[0] = arr[i];
                maxHeap.maxHeapify(0);
            }
        }
        System.out.println(maxHeap.getMax());
    }
}

class MaxHeap
{
    int[] array;
    int size;

    MaxHeap(int[] arr, int maxSize)
    {
        array = new int[maxSize];
        this.size = 0;
        for (int i = 0; i < maxSize; i++)
        {
            insert(arr[i]);
        }
    }

    public int getMax()
    {
        return array[0];
    }

    private int parent(int pos)
    {
        return pos / 2;
    }

    private int leftChild(int pos)
    {
        return 2 * pos + 1;
    }

    private int rightChild(int pos)
    {
        return 2 * pos + 2;
    }

    private void swap(int fpos, int spos)
    {
        int tmp;
        tmp = array[fpos];
        array[fpos] = array[spos];
        array[spos] = tmp;
    }

    private boolean isLeaf(int pos)
    {
        return pos >= array.length / 2 && pos < size;
    }

    public void maxHeapify(int pos)
    {
        if (isLeaf(pos))
        {
            return;
        }
        int leftChild = leftChild(pos);
        int leftValue = array[leftChild];
        int rightChild = rightChild(pos);
        int rightValue = array[rightChild];
        int value = array[pos];

        int max = Integer.max(Integer.max(value, rightValue), leftValue);
        if (max == rightValue)
        {
            swap(pos, rightChild);
            maxHeapify(rightChild);
        } else if (max == leftValue)
        {
            swap(pos, leftChild);
            maxHeapify(leftChild);
        }
    }

    public void insert(int element)
    {
        array[size++] = element;
        int current = size - 1;
        while (array[current] > array[parent(current)])
        {
            swap(current, parent(current));
            current = parent(current);
        }
    }
}
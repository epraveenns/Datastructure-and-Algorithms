package com.praveen.arrays.matrices;

public class SpiralPrintingOfMatrix
{
    public static void main(String[] args)
    {
        int[][] arr = new int[][] {
                {1,2,3,4,5,6},
                {7,8,9,10,11,12},
                {13,14,15,16,17,18}
        };

        int x = 0;
        int y = 1;
        int length = arr[0].length;
        int width = arr.length;
        int i,j,k,m;

        while (x<length || y>width-1)
        {
            for(i=x; i<length; i++)
            {
                System.out.println(arr[x][i]);
            }
            i--;
            for(j=y; j<width-1; j++)
            {
                System.out.println(arr[j][i]);
            }
            for(k=i; k>=x; k--)
            {
                System.out.println(arr[j][k]);
            }
            k++;
            j--;
            for(m=j; m>=y; m--)
            {
                System.out.println(arr[m][k]);
            }
            length--;
            width--;
            x++;
            y++;
        }
    }
}

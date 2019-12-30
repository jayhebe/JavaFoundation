package com.exercises.array;

import java.util.Arrays;

public class BubbleSortTest
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{34, 5, 22, -98, 6, -76, 0, -3};
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length - 1 - i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

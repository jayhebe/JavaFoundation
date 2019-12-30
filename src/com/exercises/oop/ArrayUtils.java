package com.exercises.oop;

import java.util.Arrays;

public class ArrayUtils
{
    public int getMax(int[] arr)
    {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            max = (max > arr[i] ? max : arr[i]);
        }

        return max;
    }

    public int getMin(int[] arr)
    {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            min = (min < arr[i] ? min : arr[i]);
        }

        return min;
    }

    public int getSum(int[] arr)
    {
        int sum = 0;
        for (int item : arr)
        {
            sum += item;
        }

        return sum;
    }

    public double getAvg(int[] arr)
    {
        return getSum(arr) / (double) (arr.length);
    }

    public void reverse(int[] arr)
    {
        for (int i = 0; i < arr.length / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public int[] copy(int[] arr)
    {
        int[] arrCopy = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            arrCopy[i] = arr[i];
        }

        return arrCopy;
    }

    public void sort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public String toString(int[] arr)
    {
        String arrString = "[";
        for (int i = 0; i < arr.length; i++)
        {
            if (i == arr.length - 1)
            {
                arrString += (arr[i] + "]");
            }
            else
            {
                arrString += (arr[i] + ", ");
            }
        }

        return arrString;
    }

    public int find(int[] arr, int item)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == item)
            {
                return i;
            }
        }

        return -1;
    }
}

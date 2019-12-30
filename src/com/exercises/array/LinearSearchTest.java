package com.exercises.array;

public class LinearSearchTest
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{34, 5, 22, -98, 6, -76, 0, -3};
        int num = 10;
        System.out.println(LinearSearchTest.search(arr, num));
    }

    public static int search(int[] intArray, int number)
    {
        for (int index = 0; index < intArray.length; index++)
        {
            if (intArray[index] == number)
            {
                return index;
            }
        }

        return -1;
    }
}

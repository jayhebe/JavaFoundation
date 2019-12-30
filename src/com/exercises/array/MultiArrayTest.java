package com.exercises.array;

public class MultiArrayTest
{
    public static void main(String[] args)
    {
        int[] randomNumbers = new int[6];
        for (int i = 0; i < randomNumbers.length; i++)
        {
            int nextNumber = (int)(Math.random() * 30 + 1);
            for (int j = 0; j < i; j++)
            {
                if (randomNumbers[j] == nextNumber)
                {

                }
            }
        }
    }
}

package com.exercises.oop;

public class ArrayUtilsTest
{
    public static void main(String[] args)
    {
        int[] arr = {32, 43, -5, 79, 0, 81, -13, 22, 18, -10};
        ArrayUtils utils = new ArrayUtils();
        int max = utils.getMax(arr);
        int min = utils.getMin(arr);
        int sum = utils.getSum(arr);
        double avg = utils.getAvg(arr);
        int[] arrCopy = utils.copy(arr);
        int index = utils.find(arr, 22);

        System.out.println("The original array is " + utils.toString(arr));
        System.out.println("The max value is " + max);
        System.out.println("The min value is " + min);
        System.out.println("The sum is " + sum);
        System.out.println("The avg is " + avg);
        System.out.println("Find index is " + index);
        System.out.println("arrCopy is " + utils.toString(arrCopy));
        utils.reverse(arr);
        System.out.println("After reverse is " + utils.toString(arr));
        utils.sort(arr);
        System.out.println("After sort is " + utils.toString(arr));
    }
}

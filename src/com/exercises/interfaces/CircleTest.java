package com.exercises.interfaces;

public class CircleTest
{
    public static void main(String[] args)
    {
        ComparableCircle c1 = new ComparableCircle(2.3);
        ComparableCircle c2 = new ComparableCircle(2.1);

        System.out.println(c1.compareTo(c2));
        System.out.println(c1.compareTo(new String("ABC")));
    }
}

package com.exercises.array;

public class ArrayTest
{
    public static void main(String[] args)
    {
        String[] names = new String[5];
        names[0] = "Alex";
        names[1] = "Jay";
        names[2] = "Sherry";
        names[3] = "Kitty";
        names[4] = "Tracy";

        for (int i = 0; i < names.length; i++)
        {
            System.out.println(names[i]);
        }

        for (String name : names)
        {
            System.out.println(name);
        }

        System.out.println(names.length);
    }
}

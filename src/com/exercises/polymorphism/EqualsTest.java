package com.exercises.polymorphism;

import java.util.Date;

public class EqualsTest
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 10;
        System.out.println(a == b);

        double c = 10;
        System.out.println(a == c);

        char d = 10;
        System.out.println(b == d);

        String str1 = "equals";
        String str2 = "equals";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = new String("hehehe");
        String str4 = new String("hehehe");
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

        Date date1 = new Date(123123123123123L);
        Date date2 = new Date(123123123123123L);
        System.out.println(date1 == date2);
        System.out.println(date1.equals(date2));
    }
}

package com.exercises.method;

public class StaticTest
{
    public static void main(String[] args)
    {
        Chinese c1 = new Chinese();
        c1.age = 12;
        c1.name = "Jay";
        System.out.println(c1.nation);

        c1.nation = "Hello";
        System.out.println(c1.nation);

        Chinese c2 = new Chinese();
        c2.age = 22;
        c2.name = "Alex";
        System.out.println(c2.nation);
    }
}

class Chinese
{
    int age;
    String name;
    static String nation = "China";
}
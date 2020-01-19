package com.exercises.blocks;

public class BlockTest
{
    public static void main(String[] args)
    {
        String flag = Person.flag;
        String lalala = Person.flag;

        Person p1 = new Person();
        Person p2 = new Person();
    }
}

class Person
{
    private int age;
    private String name;
    static String flag = "lalala";

    public Person()
    {

    }

    public int getAge()
    {
        return this.age;
    }

    public String getName()
    {
        return this.name;
    }

    {
        System.out.println("non-static block is running");
    }

    public static void info()
    {
        System.out.println("static method is running");
    }

    static
    {
        System.out.println("static block is running.");
    }
}

package com.exercises.override;

public class Person
{
    String name;
    int age;

    public Person()
    {

    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void eat()
    {
        System.out.println("eat");
    }

    public void walk(int distance)
    {
        System.out.println("The distance of walking is " + distance);
    }
}

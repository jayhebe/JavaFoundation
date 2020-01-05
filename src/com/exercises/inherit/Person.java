package com.exercises.inherit;

public class Person
{
    String name;
    int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
        System.out.println("I am a person");
    }

    public void eat()
    {
        System.out.println("Eat");
    }

    public void sleep()
    {
        System.out.println("Sleep");
    }
}

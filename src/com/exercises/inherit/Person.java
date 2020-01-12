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

    @Override
    public boolean equals(Object obj)
    {
        System.out.println("Person equals()");

        if (this == obj)
        {
            return true;
        }

        if (obj instanceof Person)
        {
            Person p = (Person)obj;
            return this.name.equals(p.name) && this.age == p.age;
        }

        return false;
    }
}

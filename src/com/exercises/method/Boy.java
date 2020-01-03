package com.exercises.method;

public class Boy
{
    private int age;
    private String name;

    public Boy(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void marry(Girl girl)
    {
        System.out.println("Got married with a girl " + girl.getName());
    }

    public void shout()
    {
        if (age >= 22)
        {
            System.out.println("You can get marry.");
        }
        else
        {
            System.out.println("Good luck");
        }
    }
}

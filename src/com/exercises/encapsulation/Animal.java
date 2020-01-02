package com.exercises.encapsulation;

public class Animal
{
    private String name;
    private int age;
    private int legs;

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public int getLegs()
    {
        return legs;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        if (age >= 0)
        {
            this.age = age;
        }
        else
        {
            this.age = 0;
        }
    }

    public void setLegs(int legs)
    {
        if (legs >= 0 && legs % 2 == 0)
        {
            this.legs = legs;
        }
        else
        {
            this.legs = 0;
        }
    }

    public void getAnimalInfo()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Legs: " + this.legs);
    }
}

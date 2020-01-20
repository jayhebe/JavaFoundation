package com.exercises.inherit;

public class AbstractTest
{
    public static void main(String[] args)
    {
//        'Human' is abstract; cannot be instantiated
//        Human human = new Human();
//        human.eat();

    }
}

abstract class Human
{
    String name;
    int age;

    public Human()
    {

    }

    public Human(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void eat()
    {
        System.out.println("eat");
    }

    public abstract void walk();
}

class Man extends Human
{
    public Man(String name, int age)
    {
        super(name, age);
    }

    @Override
    public void walk()
    {

    }
}
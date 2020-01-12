package com.exercises.polymorphism;

public class PersonTest
{
    public static void main(String[] args)
    {
        Person man = new Man();
        man.eat();
        man.walk();

        Person woman = new Woman();
        woman.eat();
        woman.walk();
    }
}

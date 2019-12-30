package com.exercises.oop;

public class Person
{
    String name;
    int age;
    /**
     * sex = 1: 表明是男性
     * sex = 0: 表明是女性
     */
    int sex;

    public void study()
    {
        System.out.println("studying");
    }

    public void showAge()
    {
        System.out.println("The age is " + this.age);
    }

    public int addAge(int i)
    {
        this.age += i;
        return this.age;
    }
}

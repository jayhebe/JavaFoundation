package com.exercises.override;

public class Student extends Person
{
    String major;

    public Student()
    {

    }

    public Student(String name, int age, String major)
    {
        super(name, age);
        this.major = major;
    }

    public void study()
    {
        System.out.println("study");
    }

    @Override
    public void eat()
    {
        System.out.println("Student eat");
        super.eat();
    }
}

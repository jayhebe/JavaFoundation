package com.exercises.inherit;

public class Student extends Person
{
    String major;

    public Student(String name, int age, String major)
    {
        super(name, age);
        this.major = major;
    }
}

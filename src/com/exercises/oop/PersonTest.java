package com.exercises.oop;

public class PersonTest
{
    public static void main(String[] args)
    {
        Person person = new Person();
        person.name = "Jay";
        person.age = 22;
        person.sex = 1;
        person.study();
        person.showAge();
        person.addAge(1);
        person.showAge();
    }
}

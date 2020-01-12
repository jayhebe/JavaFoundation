package com.exercises.inherit;

public class ExtendsTest
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Jay", 22, "Computer");
        Student student2 = new Student("Jay", 22, "Computer");
        student1.eat();
        student1.sleep();

        System.out.println(student1.equals(student2));
    }
}

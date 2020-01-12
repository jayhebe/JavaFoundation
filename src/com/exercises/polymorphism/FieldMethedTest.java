package com.exercises.polymorphism;

public class FieldMethedTest
{
    public static void main(String[] args)
    {
        Sub s = new Sub();
        System.out.println(s.count);
        s.display();

        Base b = s;
        System.out.println(b == s);
        System.out.println(b.count);
        b.display();
    }
}

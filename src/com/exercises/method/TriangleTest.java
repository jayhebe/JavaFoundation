package com.exercises.method;

public class TriangleTest
{
    public static void main(String[] args)
    {
        Triangle triangle = new Triangle(1.5, 2.4);
        double base = triangle.getBase();
        double height = triangle.getHeight();
        double area = base * height / 2;

        System.out.println("The area of triangle is " + area);
    }
}

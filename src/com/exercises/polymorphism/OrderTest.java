package com.exercises.polymorphism;

public class OrderTest
{
    public static void main(String[] args)
    {
        Order order1 = new Order(1000, "test");
        Order order2 = new Order(1001, "test");
        System.out.println(order1.equals(order2));

        Order order3 = new Order(1000, "test");
        System.out.println(order1.equals(order3));

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
    }
}

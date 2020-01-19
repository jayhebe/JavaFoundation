package com.exercises.pattern;

public class Singleton
{
    public static void main(String[] args)
    {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank1 == bank2);

        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();
        System.out.println(order1 == order2);
    }
}

//饿汉式单例模式
class Bank
{
    private Bank()
    {

    }

    private static Bank instance = new Bank();

    public static Bank getInstance()
    {
        return instance;
    }
}

//懒汉式单例模式
class Order
{
    private Order()
    {

    }

    private static Order instance = null;

    public static Order getInstance()
    {
        if (instance == null)
        {
            instance = new Order();
        }
        return instance;
    }
}

package com.exercises.interfaces;

public class InterfaceTest
{
    public static void main(String[] args)
    {
        Plane plane = new Plane();
        plane.fly();
        plane.stop();

        Bullet bullet = new Bullet();
        bullet.fly();
        bullet.stop();
        bullet.attack();
    }
}

interface Flyable
{
    public static final int MAX_SPEED = 7900;
    public static final int MIN_SPEED = 1;

    public abstract void fly();
    public abstract void stop();
}

interface Attackable
{
    public abstract void attack();
}

class Plane implements Flyable
{

    @Override
    public void fly()
    {
        System.out.println("Planes fly.");
    }

    @Override
    public void stop()
    {
        System.out.println("Planes stop.");
    }
}

class Bullet implements Flyable, Attackable
{

    @Override
    public void fly()
    {
        System.out.println("Bullet flies");
    }

    @Override
    public void stop()
    {
        System.out.println("Bullet stops");
    }

    @Override
    public void attack()
    {
        System.out.println("Bullet attacks");
    }
}
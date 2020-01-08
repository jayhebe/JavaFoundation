package com.exercises.inherit;

public class KidsTest
{
    public static void main(String[] args)
    {
        Kids someKid = new Kids();

        someKid.setSex(0);
        someKid.setSalary(0);

        someKid.manOrWoman();
        someKid.employeed();

        someKid.setYearsOld(2);
        someKid.printAage();
    }
}

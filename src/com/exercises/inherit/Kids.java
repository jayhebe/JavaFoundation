package com.exercises.inherit;

public class Kids extends ManKind
{
    private int yearsOld;

    public int getYearsOld()
    {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld)
    {
        this.yearsOld = yearsOld;
    }

    public void printAage()
    {
        System.out.println("Your age is " + this.yearsOld);
    }
}

package com.exercises.method;

public class BoyGirlTest
{
    public static void main(String[] args)
    {
        Boy boy = new Boy("Jay", 22);
        boy.shout();

        Girl girl = new Girl("Sherry", 18);
        girl.marry(boy);

        Girl girl1 = new Girl("Hebe", 20);
        girl.compare(girl1);
    }
}

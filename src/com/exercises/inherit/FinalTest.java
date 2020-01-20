package com.exercises.inherit;

public class FinalTest
{
    final int width = 10;
    final int height;

//    {
//        height = 30;
//    }

    public FinalTest()
    {
        this.height = 20;
    }

    public FinalTest(int height)
    {
        this.height = height;
    }

    public void setWidth(int width)
    {
//        this.width = width;
    }

    public void show()
    {
        final int NUM = 10;
    }

    public void show(final int num)
    {
        System.out.println(num);
    }

    public static void main(String[] args)
    {
        FinalTest test = new FinalTest();
        test.show(10);
    }
}

final class FinalA
{

}

//Cannot inherit from final 'com.exercises.inherit.FinalA'
//class FinalB extends FinalA
//{
//
//}



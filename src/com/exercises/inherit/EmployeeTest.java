package com.exercises.inherit;

public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee manager = new Manager("Jay", 25, 10000, 50000);
        manager.work();

        Employee common = new CommonEmployee("Alan", 30, 3500);
        common.work();
    }
}

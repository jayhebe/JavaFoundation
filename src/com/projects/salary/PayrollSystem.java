package com.projects.salary;

public class PayrollSystem
{
    public static void main(String[] args)
    {
        Employee[] employees = new Employee[2];

        employees[0] = new SalariedEmployee("Jay", 1001, new MyDate(1986, 2, 28), 50000);
        employees[1] = new HourlyEmployee("Alex", 1002, new MyDate(1982, 5, 18), 50, 200);

        for (int i = 0; i < employees.length; i++)
        {
            System.out.println(employees[i]);
            System.out.println("月工资为：" + employees[i].earnings());
            System.out.println();
        }
    }
}

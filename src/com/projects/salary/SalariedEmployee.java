package com.projects.salary;

public class SalariedEmployee extends Employee
{
    private double monthlySalary;

    public SalariedEmployee()
    {

    }

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary)
    {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary()
    {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary)
    {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings()
    {
        return monthlySalary;
    }

    public String toString()
    {
//        return "姓名：" + getName() + "\n工号：" + getNumber() + "\n生日：" + getBirthday().toDateString();
        return super.toString();
    }
}

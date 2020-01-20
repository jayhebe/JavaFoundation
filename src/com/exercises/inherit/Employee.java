package com.exercises.inherit;

public abstract class Employee
{
    private String name;
    private int id;
    private double salary;

    public Employee()
    {

    }

    public Employee(String name, int id, double salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public abstract void work();
}

class Manager extends Employee
{
    private double bonus;

    public Manager(String name, int age, double salary, double bonus)
    {
        super(name, age, salary);
        this.bonus = bonus;
    }

    public double getBonus()
    {
        return bonus;
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    @Override
    public void work()
    {
        System.out.println("Manager works.");
    }
}

class CommonEmployee extends Employee
{
    public CommonEmployee(String name, int age, double salary)
    {
        super(name, age, salary);
    }

    @Override
    public void work()
    {
        System.out.println("Common employee works.");
    }
}
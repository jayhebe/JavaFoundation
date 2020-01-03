package com.exercises.method;

public class Account
{
    private double balance;

    public Account(double init_balance)
    {
        this.balance = init_balance;
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amt)
    {
        if (amt > 0)
        {
            balance += amt;
            System.out.println("Deposit successful.");
        }
    }

    public void withdraw(double amt)
    {
        if (balance >= amt)
        {
            balance -= amt;
            System.out.println("Withdraw successful.");
        }
        else
        {
            System.out.println("Balance insufficient");
        }
    }
}

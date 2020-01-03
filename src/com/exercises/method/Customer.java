package com.exercises.method;

public class Customer
{
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f, String l)
    {
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public Account getAccount()
    {
        return account;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setAccount(Account account)
    {
        this.account = account;
    }
}

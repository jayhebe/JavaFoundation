package com.exercises.method;

public class Bank
{
    private Customer[] customers;
    private int numberOfCustomers;

    public Bank()
    {
        customers = new Customer[10];
    }

    public void addCustomer(String f, String l)
    {
        Customer newCustomer = new Customer(f, l);
        customers[numberOfCustomers] = newCustomer;
        numberOfCustomers++;
    }

    public int getNumberOfCustomers()
    {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index)
    {
        if (index >= 0 && index < customers.length)
        {
            return customers[index];
        }

        return null;
    }
}

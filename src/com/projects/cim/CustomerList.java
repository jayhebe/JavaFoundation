package com.projects.cim;

public class CustomerList
{
    private Customer[] customers;
    private int total;

    public CustomerList(int totalCustomer)
    {
        customers = new Customer[totalCustomer];
    }

    public boolean addCustomer(Customer customer)
    {
        if (total < customers.length)
        {
            customers[total] = customer;
            total++;

            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean replaceCustomer(int index, Customer customer)
    {
        if (index >= 0 && index < total)
        {
            customers[index] = customer;
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean deleteCustomer(int index)
    {
        if (index >= 0 && index < total)
        {
            for (int i = index; i < total - 1; i++)
            {
                customers[i] = customers[i + 1];
            }
            customers[total - 1] = null;
            total--;

            return true;
        }
        else
        {
            return false;
        }
    }

    public Customer[] getAllCustomers()
    {
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++)
        {
            custs[i] = customers[i];
        }

        return custs;
    }

    public Customer getCustomer(int index)
    {
        if (index >= 0 && index < total)
        {
            return customers[index];
        }
        else
        {
            return null;
        }
    }

    public int getTotal()
    {
        return total;
    }
}

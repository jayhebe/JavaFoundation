package com.exercises.polymorphism;

public class Order
{
    private int orderID;
    private String orderName;

    public Order(int orderID, String orderName)
    {
        this.orderID = orderID;
        this.orderName = orderName;
    }

    public int getOrderID()
    {
        return orderID;
    }

    public void setOrderID(int orderID)
    {
        this.orderID = orderID;
    }

    public String getOrderName()
    {
        return orderName;
    }

    public void setOrderName(String orderName)
    {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }

        if (obj instanceof Order)
        {
            Order orderObj = (Order)obj;
            return this.orderID == orderObj.orderID && this.orderName.equals(orderObj.orderName);
        }

        return false;
    }

    @Override
    public String toString()
    {
        return "Order{" +
                "orderID=" + orderID +
                ", orderName='" + orderName + '\'' +
                '}';
    }
}

package com.projects.cim;

public class CustomerView
{
    private CustomerList customerList = new CustomerList(10);

    public CustomerView()
    {

    }

    public void enterMainMenu()
    {
        boolean isFlag = true;
        while(isFlag)
        {
            System.out.println("\n-------------------------客户信息管理软件-------------------------");
            System.out.println("                         1. 添 加 客 户");
            System.out.println("                         2. 修 改 客 户");
            System.out.println("                         3. 删 除 客 户");
            System.out.println("                         4. 客 户 列 表");
            System.out.println("                         5. 退    出\n");
            System.out.print("                       请选择（1 - 5）");

            char choice = CustomerUtils.readMenuSelection();
            switch (choice)
            {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.print("确认是否退出（Y/N）：");
                    char isExit = CustomerUtils.readConfirmSelection();
                    if (isExit == 'Y')
                    {
                        System.exit(0);
                    }
            }
        }
    }

    private void addNewCustomer()
    {
        System.out.println("---------------------------添 加 客 户---------------------------");
        System.out.print("姓名：");
        String name = CustomerUtils.readString(10);
        System.out.print("性别：");
        char gender = CustomerUtils.readChar();
        System.out.print("年龄：");
        int age = CustomerUtils.readInt();
        System.out.print("电话：");
        String phone = CustomerUtils.readString(11);
        System.out.print("邮箱：");
        String email = CustomerUtils.readString(100);

        Customer customer = new Customer(name, gender, age, phone, email);
        boolean isAdded = customerList.addCustomer(customer);

        if (isAdded)
        {
            System.out.println("---------------------------添 加 成 功---------------------------");
        }
        else
        {
            System.out.println("---------------------------添 加 失 败---------------------------");
        }
    }

    private void modifyCustomer()
    {
        System.out.println("---------------------------修 改 客 户---------------------------");

        Customer customer;
        int index;

        while (true)
        {
            System.out.print("请输入待修改客户的编号（输入-1退出）：");
            index = CustomerUtils.readInt();
            if (index == -1)
            {
                return;
            }

            customer = customerList.getCustomer(index - 1);
            if (customer == null)
            {
                System.out.println("无法找到指定客户！");
            }
            else
            {
                break;
            }
        }

        System.out.print("姓名（" + customer.getName() + "）：");
        String name = CustomerUtils.readString(10, customer.getName());
        System.out.print("性别（" + customer.getGender() + "）：");
        char gender = CustomerUtils.readChar(customer.getGender());
        System.out.print("年龄（" + customer.getAge() + "）：");
        int age = CustomerUtils.readInt(customer.getAge());
        System.out.print("电话（" + customer.getPhone() + "）：");
        String phone = CustomerUtils.readString(11, customer.getPhone());
        System.out.print("邮箱（" + customer.getEmail() + "）：");
        String email = CustomerUtils.readString(100, customer.getEmail());

        Customer newCustomer = new Customer(name, gender, age, phone, email);
        boolean isReplaced = customerList.replaceCustomer(index - 1, newCustomer);
        if (isReplaced)
        {
            System.out.println("---------------------------修 改 成 功---------------------------");
        }
        else
        {
            System.out.println("---------------------------修 改 失 败---------------------------");
        }
    }

    private void deleteCustomer()
    {
        System.out.println("---------------------------删 除 客 户---------------------------");

        Customer customer;
        int index;

        while (true)
        {
            System.out.print("请输入待修改客户的编号（输入-1退出）：");
            index = CustomerUtils.readInt();
            if (index == -1)
            {
                return;
            }

            customer = customerList.getCustomer(index - 1);
            if (customer == null)
            {
                System.out.println("无法找到指定客户！");
            }
            else
            {
                break;
            }

        }

        System.out.print("确认是否删除（Y/N）：");
        char isDelete = CustomerUtils.readConfirmSelection();
        if (isDelete == 'Y')
        {
            boolean isDeleted = customerList.deleteCustomer(index - 1);
            if (isDeleted)
            {
                System.out.println("---------------------------删 除 成 功---------------------------");
            }
            else
            {
                System.out.println("---------------------------删 除 失 败---------------------------");
            }
        }
    }

    private void listAllCustomers()
    {
        System.out.println("---------------------------客 户 列 表---------------------------");

        int total = customerList.getTotal();
        if (total == 0)
        {
            System.out.println("没有客户记录！");
        }
        else
        {
            System.out.println("编号\t姓名\t\t性别\t年龄\t电话\t\t邮箱");
            Customer[] customers = customerList.getAllCustomers();
            for (int i = 0; i < customers.length; i++)
            {
                System.out.print(i + 1 + "\t\t");
                System.out.print(customers[i].getName() + "\t\t");
                System.out.print(customers[i].getGender() + "\t\t");
                System.out.print(customers[i].getAge() + "\t\t");
                System.out.print(customers[i].getPhone() + "\t");
                System.out.print(customers[i].getEmail());
                System.out.println();
            }
        }

        System.out.println("------------------------客 户 列 表 完 成------------------------");
    }

    public static void main(String[] args)
    {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }
}

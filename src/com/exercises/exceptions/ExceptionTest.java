package com.exercises.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionTest
{
    public static void main(String[] args)
    {
        File file = null;
        FileInputStream fis = null;
        try
        {
            file = new File("hello.txt");
            fis = new FileInputStream(file);
            int data = fis.read();
            while (data != -1)
            {
                System.out.println((char) data);
                data = fis.read();
            }
        }
        catch (IOException e)
        {
//            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("hehehe");
        }
        finally
        {
            try
            {
                if (fis != null)
                {
                    fis.close();
                }
            }
            catch (IOException e)
            {
//                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("hahaha");
            }
        }
    }
}

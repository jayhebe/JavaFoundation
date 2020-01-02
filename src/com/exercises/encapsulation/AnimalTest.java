package com.exercises.encapsulation;

public class AnimalTest
{
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        animal.setName("wangwang");
        animal.setAge(2);
        animal.setLegs(4);

        animal.getAnimalInfo();
    }
}

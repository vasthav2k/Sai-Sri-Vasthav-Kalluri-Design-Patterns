package com.epam.DesignPatterns.Factory;
import java.util.*;
import java.io.*;
public class Factory {
    public static void main(String args[])throws IOException
    {
        AnimalCharacteristics animalFactory = new AnimalCharacteristics();
        Scanner sc=new Scanner(System.in);
        System.out.print("Pick one among Cat,Dog,Elephant\nEnter the name of animal whose characteristics you want:");
        String animalName=sc.next();
        Animal p = animalFactory.getAnimal(animalName);
       System.out.println(animalName+" is a "+p.getFoodType()+" ,it is "+p.getSize()+" in size and it "+p.getSound());
    }
}

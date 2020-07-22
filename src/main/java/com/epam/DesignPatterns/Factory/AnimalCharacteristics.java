package com.epam.DesignPatterns.Factory;

public class AnimalCharacteristics {
    public Animal getAnimal(String animal){
        if(animal == null){
            return null;
        }
        if(animal.equalsIgnoreCase("Cat")) {
            return new Cat();
        }
        else if(animal.equalsIgnoreCase("Dog")){
            return new Dog();
        }
        else if(animal.equalsIgnoreCase("Elephant")) {
            return new Elephant();
        }
        return null;
    }
}

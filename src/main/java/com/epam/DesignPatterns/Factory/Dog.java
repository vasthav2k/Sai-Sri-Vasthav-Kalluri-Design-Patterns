package com.epam.DesignPatterns.Factory;

public class Dog extends Animal {
    @Override
   String getSound() {
        return "barks";
    }

    @Override
String getFoodType() {
return "Omnivore";
    }

    @Override
String getSize() {
return "small";
    }
}

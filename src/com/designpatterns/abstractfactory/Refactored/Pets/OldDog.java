package com.designpatterns.abstractfactory.Refactored.Pets;

public class OldDog implements ElderlyPet {
    @Override
    public void stroke() {
        System.out.println("I love you!");
    }

    @Override
    public void giveTreat() {
        System.out.println("Thanks!");
    }
}

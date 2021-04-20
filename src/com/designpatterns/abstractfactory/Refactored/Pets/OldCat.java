package com.designpatterns.abstractfactory.Refactored.Pets;

public class OldCat implements ElderlyPet {
    @Override
    public void stroke() {
        System.out.println("Purrrr...");
    }

    @Override
    public void giveTreat() {
        System.out.println("It's about time...");
    }
}

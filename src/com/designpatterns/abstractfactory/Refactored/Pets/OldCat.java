package com.designpatterns.abstractfactory.Refactored.Pets;

public class OldCat implements ElderlyPet {
    @Override
    public void stroke() {
        System.out.println("Stroke: Purrrr...");
    }

    @Override
    public void giveTreat() {
        System.out.println("Give treat: It's about time...");
    }
}

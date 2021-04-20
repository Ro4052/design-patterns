package com.designpatterns.abstractfactory.Refactored.Pets;

public class Cat implements AdultPet {
    @Override
    public void speak() {
        System.out.println("Meow");
    }

    @Override
    public void letsWalk() {
        System.out.println("I'm a cat, I don't walk...");
    }
}

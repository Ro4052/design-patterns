package com.designpatterns.abstractfactory.Refactored.Pets;

public class Cat implements AdultPet {
    @Override
    public void speak() {
        System.out.println("Speak: Meow");
    }

    @Override
    public void letsWalk() {
        System.out.println("Let's walk: I'm a cat, I don't walk...");
    }
}

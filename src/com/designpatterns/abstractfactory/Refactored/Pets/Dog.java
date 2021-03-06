package com.designpatterns.abstractfactory.Refactored.Pets;

public class Dog implements AdultPet {
    @Override
    public void speak() {
        System.out.println("Speak: Woof!");
    }

    @Override
    public void letsWalk() {
        System.out.println("Let's walk: Yay! A Walk!");
    }
}

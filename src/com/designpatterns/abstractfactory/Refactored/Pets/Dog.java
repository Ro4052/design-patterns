package com.designpatterns.abstractfactory.Refactored.Pets;

public class Dog implements AdultPet {
    @Override
    public void speak() {
        System.out.println("Woof!");
    }

    @Override
    public void letsWalk() {
        System.out.println("Yay! A Walk!");
    }
}

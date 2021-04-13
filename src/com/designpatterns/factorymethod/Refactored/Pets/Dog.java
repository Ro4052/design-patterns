package com.designpatterns.factorymethod.Refactored.Pets;

public class Dog implements Pet {
    @Override
    public void speak() {
        System.out.println("Woof!");
    }

    @Override
    public void letsWalk() {
        System.out.println("Yay! Walk!");
    }
}

package com.designpatterns.factorymethod.Refactored.Pets;

public class Dog implements Pet {
    private void bark() {
        System.out.println("Bark: Woof!");
    }

    private void walkTime() {
        System.out.println("Walk time: Yay! Walk!");
    }

    @Override
    public void play() {
        bark();
        walkTime();
    }
}

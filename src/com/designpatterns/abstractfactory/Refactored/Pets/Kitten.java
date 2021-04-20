package com.designpatterns.abstractfactory.Refactored.Pets;

public class Kitten implements YoungPet {
    @Override
    public void play() {
        System.out.println("I'll scratch you!");
    }

    @Override
    public void cuddle() {
        System.out.println("What are you doing?");
    }
}

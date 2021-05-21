package com.designpatterns.abstractfactory.Refactored.Pets;

public class Kitten implements YoungPet {
    @Override
    public void play() {
        System.out.println("Play: I'll scratch you!");
    }

    @Override
    public void cuddle() {
        System.out.println("Cuddle: What are you doing?");
    }
}

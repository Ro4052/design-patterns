package com.designpatterns.abstractfactory.Refactored.Pets;

public class Puppy implements YoungPet {
    @Override
    public void play() {
        System.out.println("Play: Let's play!");
    }

    @Override
    public void cuddle() {
        System.out.println("Cuddle: This is nice!");
    }
}

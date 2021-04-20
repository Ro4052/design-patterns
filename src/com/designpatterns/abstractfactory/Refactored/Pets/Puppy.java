package com.designpatterns.abstractfactory.Refactored.Pets;

public class Puppy implements YoungPet {
    @Override
    public void play() {
        System.out.println("Let's play!");
    }

    @Override
    public void cuddle() {
        System.out.println("This is nice!");
    }
}

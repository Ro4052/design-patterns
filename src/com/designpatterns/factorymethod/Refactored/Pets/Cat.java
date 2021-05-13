package com.designpatterns.factorymethod.Refactored.Pets;

public class Cat implements Pet {
    private void speak() {
        System.out.println("Speak: Meow");
    }

    private void letsWalk() {
        System.out.println("Let's walk: I'm a cat, I don't walk...");
    }

    @Override
    public void play() {
        speak();
        letsWalk();
    }
}

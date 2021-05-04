package com.designpatterns.prototype.Original.Cats;

public class PrivateCat {
    private final String colour;
    private final int age;

    public PrivateCat(String colour, int age) {
        this.colour = colour;
        this.age = age;
    }

    public void speak() {
        System.out.println("Meow, I'm a " + colour + " cat!");
    }

    public void nap() {
        System.out.println("Z" + "z".repeat(age - 1));
    }
}

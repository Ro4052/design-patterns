package com.designpatterns.prototype.Refactored.Cats;

public class PrivateCat implements CloneableCat {
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

    @Override
    public CloneableCat clone() {
        return new PrivateCat(colour, age);
    }
}

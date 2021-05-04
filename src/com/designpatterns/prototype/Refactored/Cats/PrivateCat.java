package com.designpatterns.prototype.Refactored.Cats;

public class PrivateCat implements CloneableCat<PrivateCat> {
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
    public PrivateCat clone() {
        return new PrivateCat(colour, age);
    }
}

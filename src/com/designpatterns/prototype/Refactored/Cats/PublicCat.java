package com.designpatterns.prototype.Refactored.Cats;

public class PublicCat implements CloneableCat {
    public final String colour;
    public final int age;

    public PublicCat(String colour, int age) {
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
        return new PublicCat(colour, age);
    }
}

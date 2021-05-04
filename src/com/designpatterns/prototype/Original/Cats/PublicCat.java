package com.designpatterns.prototype.Original.Cats;

public class PublicCat {
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
}

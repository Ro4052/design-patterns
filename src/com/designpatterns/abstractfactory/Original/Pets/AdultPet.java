package com.designpatterns.abstractfactory.Original.Pets;

public class AdultPet {
    private final String type;

    public AdultPet(String type) {
        this.type = type;
    }

    public void speak() {
        switch (type) {
            case "dog" -> System.out.println("Woof!");
            case "cat" -> System.out.println("Meow");
            default -> System.out.println("I don't know what noise adult " + type + " makes!");
        }
    }

    public void letsWalk() {
        switch (type) {
            case "dog" -> System.out.println("Yay! A Walk!");
            case "cat" -> System.out.println("I'm a cat, I don't walk...");
            default -> System.out.println("Does adult " + type + " like walking?");
        }
    }
}

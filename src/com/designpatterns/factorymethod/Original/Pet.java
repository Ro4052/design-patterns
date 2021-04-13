package com.designpatterns.factorymethod.Original;

public class Pet {
    private String type;

    public Pet(String type) {
        this.type = type;
    }

    public void speak() {
        switch (type) {
            case "dog" -> System.out.println("Woof!");
            case "cat" -> System.out.println("Meow");
            default -> System.out.println("I don't know what noise " + type + " makes!");
        }
    }

    public void letsWalk() {
        switch (type) {
            case "dog" -> System.out.println("Yay! Walk!");
            case "cat" -> System.out.println("I'm a cat, I don't walk...");
            default -> System.out.println("Does " + type + " like walking?");
        }
    }
}

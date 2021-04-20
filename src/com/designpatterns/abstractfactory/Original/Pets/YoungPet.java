package com.designpatterns.abstractfactory.Original.Pets;

public class YoungPet {
    private final String type;

    public YoungPet(String type) {
        this.type = type;
    }

    public void play() {
        switch (type) {
            case "dog" -> System.out.println("Let's play!");
            case "cat" -> System.out.println("I'll scratch you!");
            default -> System.out.println("I don't know if young " + type + " plays!");
        }
    }

    public void cuddle() {
        switch (type) {
            case "dog" -> System.out.println("This is nice!");
            case "cat" -> System.out.println("What are you doing?");
            default -> System.out.println("Does young " + type + " like to cuddle?");
        }
    }
}

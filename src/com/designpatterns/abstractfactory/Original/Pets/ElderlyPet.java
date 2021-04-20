package com.designpatterns.abstractfactory.Original.Pets;

public class ElderlyPet {
    private final String type;

    public ElderlyPet(String type) {
        this.type = type;
    }

    public void stroke() {
        switch (type) {
            case "dog" -> System.out.println("I love you!");
            case "cat" -> System.out.println("Purrrr...");
            default -> System.out.println("I don't know where elderly " + type + " likes being stroked!");
        }
    }

    public void giveTreat() {
        switch (type) {
            case "dog" -> System.out.println("Thanks!");
            case "cat" -> System.out.println("It's about time...");
            default -> System.out.println("Does elderly " + type + " like treats?");
        }
    }
}

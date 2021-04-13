package com.designpatterns.factorymethod.Original;

public class Original {
    public static void run() {
        // Create a dog
        System.out.println("\nDog:\n");
        Pet dog = new Pet("dog");
        dog.speak();
        dog.letsWalk();

        // Create a cat
        System.out.println("\nCat:\n");
        Pet cat = new Pet("cat");
        cat.speak();
        cat.letsWalk();

        // Create a random pet
        System.out.println("\nAardvark:\n");
        Pet aardvark = new Pet("aardvark");
        aardvark.speak();
        aardvark.letsWalk();
    }
}

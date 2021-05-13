package com.designpatterns.factorymethod.Original;

import com.designpatterns.factorymethod.Original.Pets.*;

public class Original {
    public static void run() {
        // Create a dog
        System.out.println("\nDog:\n");
        Dog dog = new Dog();
        dog.bark();
        dog.walkTime();

        // Create a cat
        System.out.println("\nCat:\n");
        Cat cat = new Cat();
        cat.speak();
        cat.letsWalk();
    }
}

package com.designpatterns.factorymethod.Refactored;

import com.designpatterns.factorymethod.Refactored.Owners.*;

public class Refactored {
    public static void run() {
        // Create a dog owner
        System.out.println("\nDog:\n");
        DogOwner dogOwner = new DogOwner();
        dogOwner.playWithPet();
        System.out.println("");
        dogOwner.playWithPet();

        // Create a cat owner
        System.out.println("\nCat:\n");
        CatOwner catOwner = new CatOwner();
        catOwner.playWithPet();
        System.out.println("");
        catOwner.playWithPet();
    }
}

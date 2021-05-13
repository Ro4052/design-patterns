package com.designpatterns.factorymethod.Refactored;

import com.designpatterns.factorymethod.Refactored.Owners.*;

public class Refactored {
    public static void playWithPet(Owner petOwner) {
        petOwner.playWithPet();
        System.out.println("");
        petOwner.playWithPet();
    }

    public static void run() {
        // Create a dog owner
        System.out.println("\nDog:\n");
        DogOwner dogOwner = new DogOwner();
        playWithPet(dogOwner);
        playWithPet(dogOwner);

        // Create a cat owner
        System.out.println("\nCat:\n");
        CatOwner catOwner = new CatOwner();
        playWithPet(catOwner);
        playWithPet(catOwner);
    }
}

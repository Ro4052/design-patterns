package com.designpatterns.abstractfactory.Refactored;

import com.designpatterns.abstractfactory.Refactored.Families.*;
import com.designpatterns.abstractfactory.Refactored.Pets.*;

public class Refactored {
    public static void interactWithPetFamily(PetFamily petFamily) {
        YoungPet youngPet = petFamily.createYoungPet();
        AdultPet adultPet = petFamily.createAdultPet();
        ElderlyPet elderlyPet = petFamily.createElderlyPet();

        System.out.println("\nYoung pet:");
        youngPet.play();
        youngPet.cuddle();
        System.out.println("\nAdult pet:");
        adultPet.speak();
        adultPet.letsWalk();
        System.out.println("\nElderly pet:");
        elderlyPet.stroke();
        elderlyPet.giveTreat();
    }

    public static void run() {
        // Create a dog family
        System.out.println("\nDog:");
        interactWithPetFamily(new DogFamily());

        // Create a cat family
        System.out.println("\nCat:");
        interactWithPetFamily(new CatFamily());
    }
}

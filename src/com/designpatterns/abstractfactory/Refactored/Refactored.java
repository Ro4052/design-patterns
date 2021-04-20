package com.designpatterns.abstractfactory.Refactored;

import com.designpatterns.abstractfactory.Refactored.Families.*;
import com.designpatterns.abstractfactory.Refactored.Pets.*;

public class Refactored {
    public static void run() {
        // Create a dog family
        System.out.println("\nDog:");
        DogFamily dogFamily = new DogFamily();
        YoungPet puppy = dogFamily.createYoungPet();
        AdultPet dog = dogFamily.createAdultPet();
        ElderlyPet oldDog = dogFamily.createElderlyPet();

        System.out.println("\nPuppy");
        puppy.play();
        puppy.cuddle();
        System.out.println("\nDog");
        dog.speak();
        dog.letsWalk();
        System.out.println("\nOld dog");
        oldDog.stroke();
        oldDog.giveTreat();

        // Create a cat family
        System.out.println("\nCat:");
        CatFamily catFamily = new CatFamily();
        YoungPet kitten = catFamily.createYoungPet();
        AdultPet cat = catFamily.createAdultPet();
        ElderlyPet oldCat = catFamily.createElderlyPet();

        System.out.println("\nKitten");
        kitten.play();
        kitten.cuddle();
        System.out.println("\nCat");
        cat.speak();
        cat.letsWalk();
        System.out.println("\nOld cat");
        oldCat.stroke();
        oldCat.giveTreat();
    }
}

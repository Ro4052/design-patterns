package com.designpatterns.abstractfactory.Original;

import com.designpatterns.abstractfactory.Original.Pets.*;

public class Original {
    public static void run() {
        // Create a dog family
        System.out.println("\nDog:");
        YoungPet puppy = new YoungPet("dog");
        AdultPet dog = new AdultPet("dog");
        ElderlyPet oldDog = new ElderlyPet("dog");

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
        YoungPet kitten = new YoungPet("cat");
        AdultPet cat = new AdultPet("cat");
        ElderlyPet oldCat = new ElderlyPet("cat");

        System.out.println("\nKitten");
        kitten.play();
        kitten.cuddle();
        System.out.println("\nCat");
        cat.speak();
        cat.letsWalk();
        System.out.println("\nOld cat");
        oldCat.stroke();
        oldCat.giveTreat();

        // Create a random pet family
        System.out.println("\nAardvark:");
        YoungPet youngAardvark = new YoungPet("aardvark");
        AdultPet aardvark = new AdultPet("aardvark");
        ElderlyPet elderlyAardvark = new ElderlyPet("aardvark");

        System.out.println("\nYoung aardvark");
        youngAardvark.play();
        youngAardvark.cuddle();
        System.out.println("\nAardvark");
        aardvark.speak();
        aardvark.letsWalk();
        System.out.println("\nElderly aardvark");
        elderlyAardvark.stroke();
        elderlyAardvark.giveTreat();
    }
}

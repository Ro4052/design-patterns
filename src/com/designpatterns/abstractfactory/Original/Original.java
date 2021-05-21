package com.designpatterns.abstractfactory.Original;

import com.designpatterns.abstractfactory.Original.Pets.*;

public class Original {
    public static void run() {
        // Create a dog family
        System.out.println("\nDog:");
        Puppy puppy = new Puppy();
        Dog dog = new Dog();
        OldDog oldDog = new OldDog();

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
        Kitten kitten = new Kitten();
        Cat cat = new Cat();
        OldCat oldCat = new OldCat();

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

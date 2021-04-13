package com.designpatterns.factorymethod.Refactored.Owners;

import com.designpatterns.factorymethod.Refactored.Pets.Pet;

public abstract class Owner {
    protected abstract Pet createPet();

    public void playWithPet() {
        Pet pet = createPet();
        System.out.println("Play time!");
        System.out.println("Speak:");
        pet.speak();
        System.out.println("Let's walk:");
        pet.letsWalk();
    }
}

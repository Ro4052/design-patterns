package com.designpatterns.factorymethod.Refactored.Owners;

import com.designpatterns.factorymethod.Refactored.Pets.*;

public class DogOwner extends Owner {
    private Pet dog;

    @Override
    protected Pet createPet() {
        if (dog == null) {
            System.out.println("Adopting a dog!");
            dog = new Dog();
        }

        return dog;
    }
}

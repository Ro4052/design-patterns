package com.designpatterns.abstractfactory.Refactored.Families;

import com.designpatterns.abstractfactory.Refactored.Pets.*;

public class DogFamily implements PetFamily {
    @Override
    public YoungPet createYoungPet() {
        return new Puppy();
    }

    @Override
    public AdultPet createAdultPet() {
        return new Dog();
    }

    @Override
    public ElderlyPet createElderlyPet() {
        return new OldDog();
    }
}

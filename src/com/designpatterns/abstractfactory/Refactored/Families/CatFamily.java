package com.designpatterns.abstractfactory.Refactored.Families;

import com.designpatterns.abstractfactory.Refactored.Pets.*;

public class CatFamily implements PetFamily {
    @Override
    public YoungPet createYoungPet() {
        return new Kitten();
    }

    @Override
    public AdultPet createAdultPet() {
        return new Cat();
    }

    @Override
    public ElderlyPet createElderlyPet() {
        return new OldCat();
    }
}

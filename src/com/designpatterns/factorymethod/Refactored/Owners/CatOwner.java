package com.designpatterns.factorymethod.Refactored.Owners;

import com.designpatterns.factorymethod.Refactored.Pets.*;

public class CatOwner extends Owner {
    @Override
    protected Pet createPet() {
        System.out.println("Adopting a cat!");
        return new Cat();
    }
}

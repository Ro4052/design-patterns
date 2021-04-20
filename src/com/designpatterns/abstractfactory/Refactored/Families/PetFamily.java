package com.designpatterns.abstractfactory.Refactored.Families;

import com.designpatterns.abstractfactory.Refactored.Pets.*;

public interface PetFamily {
    YoungPet createYoungPet();
    AdultPet createAdultPet();
    ElderlyPet createElderlyPet();
}

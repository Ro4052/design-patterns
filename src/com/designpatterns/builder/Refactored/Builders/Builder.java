package com.designpatterns.builder.Refactored.Builders;

import com.designpatterns.builder.Refactored.Entities.GARDEN_SIZE;

public interface Builder<T> {
    Builder<T> reset();
    Builder<T> setNumberOfStories(int numberOfStories);
    Builder<T> setNumberOfRooms(int numberOfRooms);
    Builder<T> setNumberOfDoors(int numberOfDoors);
    Builder<T> setNumberOfWindows(int numberOfWindows);
    Builder<T> setGardenSize(GARDEN_SIZE gardenSize);
    Builder<T> setHasGarage(boolean hasGarage);
    Builder<T> setNumberOfStatues(int numberOfStatues);
    T build();
}

package com.designpatterns.builder.Refactored.Builders;

import com.designpatterns.builder.Refactored.Entities.*;

public class HouseBuilder implements Builder<House> {
    private int numberOfStories;
    private int numberOfRooms;
    private int numberOfDoors;
    private int numberOfWindows;
    private GARDEN_SIZE gardenSize;
    private boolean hasGarage;
    private int numberOfStatues;

    @Override
    public Builder<House> reset() {
        numberOfStories = 0;
        numberOfRooms = 0;
        numberOfDoors = 0;
        numberOfWindows = 0;
        gardenSize = GARDEN_SIZE.SMALL;
        hasGarage = false;
        numberOfStatues = 0;

        return this;
    }

    @Override
    public Builder<House> setNumberOfStories(int numberOfStories) {
        this.numberOfStories = numberOfStories;
        return this;
    }

    @Override
    public Builder<House> setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
        return this;
    }

    @Override
    public Builder<House> setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    @Override
    public Builder<House> setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    @Override
    public Builder<House> setGardenSize(GARDEN_SIZE gardenSize) {
        this.gardenSize = gardenSize;
        return this;
    }

    @Override
    public Builder<House> setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }

    @Override
    public Builder<House> setNumberOfStatues(int numberOfStatues) {
        this.numberOfStatues = numberOfStatues;
        return this;
    }

    @Override
    public House build() {
        return new House(
                numberOfStories, numberOfRooms, numberOfDoors, numberOfWindows,
                gardenSize, hasGarage, numberOfStatues
        );
    }
}

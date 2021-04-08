package com.designpatterns.builder.Refactored.Builders;

import com.designpatterns.builder.Refactored.Entities.*;

public class HousePlanBuilder implements Builder<HousePlan> {
    private int numberOfStories;
    private int numberOfRooms;
    private int numberOfDoors;
    private int numberOfWindows;
    private GARDEN_SIZE gardenSize;
    private boolean hasGarage;
    private int numberOfStatues;

    @Override
    public Builder<HousePlan> reset() {
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
    public Builder<HousePlan> setNumberOfStories(int numberOfStories) {
        this.numberOfStories = numberOfStories;
        return this;
    }

    @Override
    public Builder<HousePlan> setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
        return this;
    }

    @Override
    public Builder<HousePlan> setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    @Override
    public Builder<HousePlan> setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    @Override
    public Builder<HousePlan> setGardenSize(GARDEN_SIZE gardenSize) {
        this.gardenSize = gardenSize;
        return this;
    }

    @Override
    public Builder<HousePlan> setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }

    @Override
    public Builder<HousePlan> setNumberOfStatues(int numberOfStatues) {
        this.numberOfStatues = numberOfStatues;
        return this;
    }

    @Override
    public HousePlan build() {
        return new HousePlan(
                numberOfStories, numberOfRooms, numberOfDoors, numberOfWindows,
                gardenSize, hasGarage, numberOfStatues
        );
    }
}

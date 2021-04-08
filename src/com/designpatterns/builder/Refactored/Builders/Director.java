package com.designpatterns.builder.Refactored.Builders;

import com.designpatterns.builder.Refactored.Entities.*;

public class Director {
    public static <T> T makeBasicHouse(Builder<T> builder) {
        return builder
                .reset()
                .setNumberOfStories(1)
                .setNumberOfRooms(3)
                .setNumberOfDoors(1)
                .setNumberOfWindows(2)
                .build();
    }

    public static <T> T makeLargeHouse(Builder<T> builder) {
        return builder
                .reset()
                .setNumberOfStories(3)
                .setNumberOfRooms(10)
                .setNumberOfDoors(3)
                .setNumberOfWindows(12)
                .setGardenSize(GARDEN_SIZE.LARGE)
                .setHasGarage(true)
                .setNumberOfStatues(3)
                .build();
    }
}

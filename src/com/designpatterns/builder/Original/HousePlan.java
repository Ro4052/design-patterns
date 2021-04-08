package com.designpatterns.builder.Original;

import com.designpatterns.builder.Original.GARDEN_SIZE;

public class HousePlan {
    public final int numberOfStories;
    public final int numberOfRooms;
    public final int numberOfDoors;
    public final int numberOfWindows;
    public final GARDEN_SIZE gardenSize;
    public final boolean hasGarage;
    public final int numberOfStatues;

    public HousePlan(
            int numberOfStories, int numberOfRooms, int numberOfDoors,
            int numberOfWindows, GARDEN_SIZE gardenSize, boolean hasGarage,
            int numberOfStatues
    ) {
        this.numberOfStories = numberOfStories;
        this.numberOfRooms = numberOfRooms;
        this.numberOfDoors = numberOfDoors;
        this.numberOfWindows = numberOfWindows;
        this.gardenSize = gardenSize;
        this.hasGarage = hasGarage;
        this.numberOfStatues = numberOfStatues;
    }

    public void printHousePlan() {
        System.out.println("<<< House plans >>>");
        System.out.println("Number of stories: " + numberOfStories);
        System.out.println("Number of rooms: " + numberOfRooms);
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Number of windows: " + numberOfWindows);
        System.out.println("Garden size: " + gardenSize);
        System.out.println("Has garage: " + hasGarage);
        System.out.println("Number of statues " + numberOfStatues);
    }
}

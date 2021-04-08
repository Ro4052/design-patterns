package com.designpatterns.builder.Original;

import com.designpatterns.builder.Original.GARDEN_SIZE;

public class House {
    public final int numberOfStories;
    public final int numberOfRooms;
    public final int numberOfDoors;
    public final int numberOfWindows;
    public final GARDEN_SIZE gardenSize;
    public final boolean hasGarage;
    public final int numberOfStatues;

    public House(
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

    public void printHouse() {
        System.out.println("<<< House attributes >>>");
        System.out.println("Number of stories: " + numberOfStories);
        System.out.println("Number of rooms: " + numberOfRooms);
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Number of windows: " + numberOfWindows);
        System.out.println("Garden size: " + gardenSize);
        System.out.println("Has garage: " + hasGarage);
        System.out.println("Number of statues " + numberOfStatues);
    }
}

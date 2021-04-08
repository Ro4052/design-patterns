package com.designpatterns.builder.Refactored;

import com.designpatterns.builder.Refactored.Builders.*;
import com.designpatterns.builder.Refactored.Entities.*;

public class Refactored {
    public static void run() {
        // Make the builders
        HouseBuilder houseBuilder = new HouseBuilder();
        HousePlanBuilder housePlanBuilder = new HousePlanBuilder();

        // Draw a basic house plan
        System.out.println("\nBasic house plan:");
        HousePlan basicHousePlan = Director.makeBasicHouse(housePlanBuilder);
        basicHousePlan.printHousePlan();

        // Build a basic house
        System.out.println("\nBasic house:");
        House basicHouse = Director.makeBasicHouse(houseBuilder);
        basicHouse.printHouse();

        // Draw a large house plan
        System.out.println("\nLarge house plan:");
        HousePlan largeHousePlan = Director.makeLargeHouse(housePlanBuilder);
        largeHousePlan.printHousePlan();

        // Build a large house
        System.out.println("\nLarge house:");
        House largeHouse = Director.makeLargeHouse(houseBuilder);
        largeHouse.printHouse();
    }
}

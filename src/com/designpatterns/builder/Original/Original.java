package com.designpatterns.builder.Original;

public class Original {
    public static void run() {
        // Draw a basic house plan
        System.out.println("\nBasic house plan:");
        HousePlan basicHousePlan = new HousePlan(
                1, 3, 1, 2,
                GARDEN_SIZE.SMALL, false, 0
        );
        basicHousePlan.printHousePlan();

        // Build a basic house
        System.out.println("\nBasic house:");
        House basicHouse = new House(
                1, 3, 1, 2,
                GARDEN_SIZE.SMALL, false, 0
        );
        basicHouse.printHouse();

        // Draw a large house plan
        System.out.println("\nLarge house plan:");
        HousePlan largeHousePlan = new HousePlan(
                3, 10, 3, 12,
                GARDEN_SIZE.LARGE, true, 3
        );
        largeHousePlan.printHousePlan();

        // Build a large house
        System.out.println("\nLarge house:");
        House largeHouse = new House(
                3, 10, 3, 12,
                GARDEN_SIZE.LARGE, true, 3
        );
        largeHouse.printHouse();
    }
}

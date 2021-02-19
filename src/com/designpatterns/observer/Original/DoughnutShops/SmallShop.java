package com.designpatterns.observer.Original.DoughnutShops;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SmallShop {
    private Random random = new Random();
    private List<String> flavours = new ArrayList<>();

    public void newDoughnutFilling(String filling) {
        System.out.println("\nSmall shop:");
        System.out.println("New filling: " + filling);
        if (random.nextBoolean()) {
            System.out.println("Adding to menu...");
            flavours.add(filling);
        } else {
            System.out.println("Not adding to menu...");
        }
        System.out.println("Current flavours: " + String.join(", ", flavours));
    }
}

package com.designpatterns.Observer.Refactored.DoughnutShops;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SmallShop implements DoughnutSubscriber {
    private Random random = new Random();
    private List<String> flavours = new ArrayList<>();

    @Override
    public void doughnutUpdate(List<String> doughnuts) {
        String newFilling = doughnuts.get(doughnuts.size() - 1);
        System.out.println("\nSmall shop:");
        System.out.println("New filling: " + newFilling);
        if (random.nextBoolean()) {
            System.out.println("Adding to menu...");
            flavours.add(newFilling);
        } else {
            System.out.println("Not adding to menu...");
        }
        System.out.println("Current flavours: " + String.join(", ", flavours));
    }
}

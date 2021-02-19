package com.designpatterns.observer.Refactored.DoughnutShops;

import java.util.ArrayList;
import java.util.List;

public class LargeShop implements DoughnutSubscriber {
    private List<String> flavours = new ArrayList<>();

    @Override
    public void doughnutUpdate(List<String> doughnuts) {
        flavours = doughnuts;
        System.out.println("\nLarge shop:");
        System.out.println("Refreshed flavours: " + String.join(", ", flavours));
    }
}

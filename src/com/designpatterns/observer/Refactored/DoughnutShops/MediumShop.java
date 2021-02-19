package com.designpatterns.observer.Refactored.DoughnutShops;

import java.util.ArrayList;
import java.util.List;

public class MediumShop implements DoughnutSubscriber {
    private List<String> flavours = new ArrayList<>();

    @Override
    public void doughnutUpdate(List<String> doughnuts) {
        flavours = doughnuts;
        System.out.println("\nMedium shop:");
        System.out.println("Latest flavours: " + String.join(", ", flavours));
    }
}

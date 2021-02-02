package com.designpatterns.Observer.Original.DoughnutShops;

import java.util.ArrayList;
import java.util.List;

public class LargeShop {
    private List<String> flavours = new ArrayList<>();

    public void refreshDoughnutFlavours(List<String> flavours) {
        this.flavours = flavours;
        System.out.println("\nLarge shop:");
        System.out.println("Refreshed flavours: " + String.join(", ", this.flavours));
    }
}

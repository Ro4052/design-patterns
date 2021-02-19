package com.designpatterns.observer.Original.DoughnutShops;

import java.util.ArrayList;
import java.util.List;

public class MediumShop {
    private List<String> flavours = new ArrayList<>();

    public void latestDoughnutFlavours(List<String> flavours) {
        this.flavours = flavours;
        System.out.println("\nMedium shop:");
        System.out.println("Latest flavours: " + String.join(", ", this.flavours));
    }
}

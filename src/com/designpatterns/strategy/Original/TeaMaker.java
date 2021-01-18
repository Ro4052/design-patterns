package com.designpatterns.strategy.Original;

public class TeaMaker {
    private void boilWater() {
        System.out.println("\nBoiling water...");
    }

    private void pourTea() {
        System.out.println("Pouring tea");
    }

    public void brewTea(String type) {
        boilWater();
        if (type == "Breakfast") {
            System.out.println("Brewing Breakfast tea...");
        } else if (type == "Earl Grey") {
            System.out.println("Brewing Earl Grey tea...");
        } else if (type == "Matcha") {
            System.out.println("Brewing Matcha tea...");
        } else if (type == "Oolong") {
            System.out.println("Brewing Oolong tea...");
        } else {
            System.out.println("I don't know what kind of tea that is!");
            return;
        }
        pourTea();
    }
}

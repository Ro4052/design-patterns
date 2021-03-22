package com.designpatterns.strategy.Original;

public class TeaMaker {
    private void boilWater() {
        System.out.println("\nBoiling water...");
    }

    private void pourTea() {
        System.out.println("Pouring tea...");
    }

    public void brewTea(String type) {
        boilWater();
        switch (type) {
            case "Breakfast" -> System.out.println("Brewing Breakfast tea...");
            case "Earl Grey" -> System.out.println("Brewing Earl Grey tea...");
            case "Matcha" -> System.out.println("Brewing Matcha tea...");
            case "Oolong" -> System.out.println("Brewing Oolong tea...");
            default -> {
                System.out.println("I don't know what kind of tea that is!");
                return;
            }
        }
        pourTea();
    }
}

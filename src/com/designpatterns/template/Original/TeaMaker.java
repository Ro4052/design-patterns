package com.designpatterns.template.Original;

public class TeaMaker {
    private void boilWater(String type) {
        if (type.equals("Matcha") || type.equals("Oolong")) {
            System.out.println("\nBoiling water to 80 deg...");
            return;
        }
        System.out.println("\nBoiling water to 100deg...");
    }

    private void brewTea(String type) throws Exception {
        switch (type) {
            case "Breakfast" -> System.out.println("Brewing Breakfast tea...");
            case "Earl Grey" -> System.out.println("Brewing Earl Grey tea...");
            case "Matcha" -> System.out.println("Brewing Matcha tea...");
            case "Oolong" -> System.out.println("Brewing Oolong tea...");
            default -> {
                System.out.println("I don't know what kind of tea that is!");
                throw new Exception();
            }
        }
    }

    private void pourTea() {
        System.out.println("Pouring tea...");
    }

    private void afterPouringAction(String type) {
        if (type.equals("Breakfast")) {
            System.out.println("Adding milk...");
        }
    }

    public void makeTea(String type) {
        boilWater(type);
        try {
            brewTea(type);
        } catch (Exception e) {
            System.out.println("Couldn't make the tea!");
        } finally {
            pourTea();
            afterPouringAction(type);
        }
    }
}

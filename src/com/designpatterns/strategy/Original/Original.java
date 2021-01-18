package com.designpatterns.strategy.Original;

public class Original {
    public static void run() {
        // Create a tea maker
        TeaMaker teaMaker = new TeaMaker();

        // Brew some tea!
        teaMaker.brewTea("Breakfast");
        teaMaker.brewTea("Earl Grey");
        teaMaker.brewTea("Matcha");
        teaMaker.brewTea("Oolong");
        teaMaker.brewTea("Darjeeling");
    }
}

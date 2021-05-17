package com.designpatterns.bridge.Refactored.Motors;

public class PetrolEngine implements Motor {
    @Override
    public void start() {
        System.out.println("Starting petrol engine...");
    }

    @Override
    public void move(double speed) {
        System.out.println("Driving petrol engine at " + speed + " kph!");
    }
}

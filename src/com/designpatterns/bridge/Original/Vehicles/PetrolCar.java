package com.designpatterns.bridge.Original.Vehicles;

public class PetrolCar implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting car...");
        System.out.println("Starting petrol engine...");
    }

    @Override
    public void drive(double speed) {
        System.out.println("Driving car...");
        System.out.println("Driving petrol engine at " + speed + " kph!");
    }

    @Override
    public void steer(DIRECTION direction) {
        String directionString = direction == DIRECTION.LEFT ? "left" : "right";
        System.out.println("Turning wheel " + directionString + "...");
    }
}

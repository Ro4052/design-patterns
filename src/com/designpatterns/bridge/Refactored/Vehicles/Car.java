package com.designpatterns.bridge.Refactored.Vehicles;

import com.designpatterns.bridge.Refactored.Motors.Motor;

public class Car extends Vehicle {
    public Car(Motor motor) {
        super(motor);
    }

    @Override
    public void start() {
        System.out.println("Starting car...");
        super.start();
    }

    @Override
    public void drive(double speed) {
        System.out.println("Driving car...");
        super.drive(speed);
    }

    @Override
    public void steer(DIRECTION direction) {
        String directionString = direction == DIRECTION.LEFT ? "left" : "right";
        System.out.println("Turning wheel " + directionString + "...");
    }
}

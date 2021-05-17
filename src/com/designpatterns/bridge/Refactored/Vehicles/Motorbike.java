package com.designpatterns.bridge.Refactored.Vehicles;

import com.designpatterns.bridge.Refactored.Motors.Motor;

public class Motorbike extends Vehicle {
    public Motorbike(Motor motor) {
        super(motor);
    }

    @Override
    public void start() {
        System.out.println("Starting motor bike...");
        super.start();
    }

    @Override
    public void drive(double speed) {
        System.out.println("Driving motorbike...");
        super.drive(speed);
    }

    @Override
    public void steer(DIRECTION direction) {
        String directionString = direction == DIRECTION.LEFT ? "left" : "right";
        System.out.println("Leaning " + directionString + "...");
    }
}

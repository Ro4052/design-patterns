package com.designpatterns.bridge.Refactored.Vehicles;

import com.designpatterns.bridge.Refactored.Motors.Motor;

abstract public class Vehicle {
    private final Motor motor;

    public Vehicle(Motor motor) {
        this.motor = motor;
    }

    public void start() {
        motor.start();
    }

    public void drive(double speed) {
        motor.move(speed);
    }

    public abstract void steer(DIRECTION direction);
}

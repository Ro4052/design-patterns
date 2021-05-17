package com.designpatterns.bridge.Refactored.Motors;

public class ElectricMotor implements Motor {
    @Override
    public void start() {
        System.out.println("Electric motor ready...");
    }

    @Override
    public void move(double speed) {
        System.out.println("Driving electric motor at " + speed + " kph!");
    }
}

package com.designpatterns.bridge.Original.Vehicles;

public interface Vehicle {
    void start();
    void drive(double speed);
    void steer(DIRECTION direction);
}

package com.designpatterns.state.Refactored.States;

import com.designpatterns.state.Refactored.SimpleParkingMeter;

public class EmptyState extends BaseState {
    public EmptyState(SimpleParkingMeter parkingMeter) {
        super(parkingMeter);
    }

    @Override
    public void insert50p() {
        System.out.println("Adding 50p...");
        parkingMeter.changeState(new FiftyPenceState(parkingMeter));
    }

    @Override
    public void insert1Pound() {
        System.out.println("Adding £1...");
        parkingMeter.changeState(new OnePoundState(parkingMeter));
    }

    @Override
    public void eject() {
        System.out.println("No money inserted...");
    }

    @Override
    public void print() {
        System.out.println("Not enough money, please insert £1...");
    }
}

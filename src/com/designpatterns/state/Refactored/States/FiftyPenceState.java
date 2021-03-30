package com.designpatterns.state.Refactored.States;

import com.designpatterns.state.Refactored.SimpleParkingMeter;

public class FiftyPenceState extends BaseState {
    public FiftyPenceState(SimpleParkingMeter parkingMeter) {
        super(parkingMeter);
    }

    @Override
    public void insert50p() {
        System.out.println("Adding 50p...");
        parkingMeter.changeState(new OnePoundState(parkingMeter));
    }

    @Override
    public void insert1Pound() {
        System.out.println("Adding £1...");
        parkingMeter.changeState(new OnePoundFiftyState(parkingMeter));
    }

    @Override
    public void eject() {
        System.out.println("Cancelling payment and ejecting 50p...");
        parkingMeter.changeState(new EmptyState(parkingMeter));
    }

    @Override
    public void print() {
        System.out.println("Not enough money, please insert 50p...");
    }
}

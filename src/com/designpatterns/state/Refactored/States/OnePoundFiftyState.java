package com.designpatterns.state.Refactored.States;

import com.designpatterns.state.Refactored.SimpleParkingMeter;

public class OnePoundFiftyState extends BaseState {
    public OnePoundFiftyState(SimpleParkingMeter parkingMeter) {
        super(parkingMeter);
    }

    @Override
    public void insert50p() {
        System.out.println("No more money needed, ejecting 50p...");
    }

    @Override
    public void insert1Pound() {
        System.out.println("No more money needed, ejecting £1...");
    }

    @Override
    public void eject() {
        System.out.println("Cancelling payment and ejecting £1.50...");
        parkingMeter.changeState(new EmptyState(parkingMeter));
    }

    @Override
    public void print() {
        System.out.println("Printing ticket...");
        System.out.println("Ejecting 50p...");
        parkingMeter.changeState(new EmptyState(parkingMeter));
    }
}

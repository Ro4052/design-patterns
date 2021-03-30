package com.designpatterns.state.Refactored.States;

import com.designpatterns.state.Refactored.SimpleParkingMeter;

public class OnePoundState extends BaseState {
    public OnePoundState(SimpleParkingMeter parkingMeter) {
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
        System.out.println("Cancelling payment and ejecting £1...");
        parkingMeter.changeState(new EmptyState(parkingMeter));
    }

    @Override
    public void print() {
        System.out.println("Printing ticket...");
        System.out.println("Exact amount, no change...");
        parkingMeter.changeState((new EmptyState(parkingMeter)));
    }
}

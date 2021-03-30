package com.designpatterns.state.Refactored;

import com.designpatterns.state.Refactored.States.EmptyState;
import com.designpatterns.state.Refactored.States.SimpleParkingMeterState;

public class SimpleParkingMeter {
    private SimpleParkingMeterState state;

    public SimpleParkingMeter() {
        changeState(new EmptyState(this));
    }

    public void changeState(SimpleParkingMeterState state) {
        this.state = state;
    }

    public void insert50p() {
        state.insert50p();
    }

    public void insert1Pound() {
        state.insert1Pound();
    }

    public void eject() {
        state.eject();
    }

    public void print() {
        state.print();
    }
}

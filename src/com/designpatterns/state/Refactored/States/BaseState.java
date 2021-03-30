package com.designpatterns.state.Refactored.States;

import com.designpatterns.state.Refactored.SimpleParkingMeter;

public abstract class BaseState implements SimpleParkingMeterState {
    protected SimpleParkingMeter parkingMeter;

    public BaseState(SimpleParkingMeter parkingMeter) {
        this.parkingMeter = parkingMeter;
    }

    @Override
    abstract public void insert50p();

    @Override
    abstract public void insert1Pound();

    @Override
    abstract public void eject();

    @Override
    abstract public void print();
}

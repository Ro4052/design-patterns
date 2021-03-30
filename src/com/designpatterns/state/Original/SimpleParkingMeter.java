package com.designpatterns.state.Original;

public class SimpleParkingMeter {
    private double amount = 0;

    public void insert50p() {
        if (amount < 1) {
            System.out.println("Adding 50p...");
            amount += 0.5;
        } else {
            System.out.println("No more money needed, ejecting 50p...");
        }
    }

    public void insert1Pound() {
        if (amount < 1) {
            System.out.println("Adding £1...");
            amount += 1;
        } else {
            System.out.println("No more money needed, ejecting £1...");
        }
    }

    public void eject() {
        if (amount > 0) {
            System.out.println("Cancelling payment and ejecting £" + amount + "...");
            amount = 0;
        } else {
            System.out.println("No money inserted...");
        }
    }

    public void print() {
        if (amount >= 1) {
            System.out.println("Printing ticket...");
            if (amount > 1) {
                System.out.println("Ejecting £" + (amount - 1) + "...");
            } else {
                System.out.println("Exact amount, no change...");
            }
            amount = 0;
        } else {
            System.out.println("Not enough money, please insert £" + (amount - 1) + "...");
        }
    }
}

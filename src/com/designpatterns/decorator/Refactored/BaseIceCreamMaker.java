package com.designpatterns.decorator.Refactored;

public class BaseIceCreamMaker implements IceCreamMaker {
    private void getBowl() {
        System.out.println("\nGetting ice cream bowl...");
    }

    private void scoopIceCream() {
        System.out.println("Scooping ice cream...");
    }

    @Override
    public void make() {
        getBowl();
        scoopIceCream();
    }
}

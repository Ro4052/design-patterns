package com.designpatterns.decorator.Original.IceCreamMakers;

public class IceCreamMaker {
    private void getBowl() {
        System.out.println("\nGetting ice cream bowl...");
    }

    private void scoopIceCream() {
        System.out.println("Scooping ice cream...");
    }

    public void make() {
        getBowl();
        scoopIceCream();
    }
}

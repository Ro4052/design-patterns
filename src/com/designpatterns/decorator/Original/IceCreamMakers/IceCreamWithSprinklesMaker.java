package com.designpatterns.decorator.Original.IceCreamMakers;

public class IceCreamWithSprinklesMaker extends IceCreamMaker {
    @Override
    public void make() {
        super.make();
        System.out.println("Adding sprinkles...");
    }
}

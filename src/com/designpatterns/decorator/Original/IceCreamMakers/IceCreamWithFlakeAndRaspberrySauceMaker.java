package com.designpatterns.decorator.Original.IceCreamMakers;

public class IceCreamWithFlakeAndRaspberrySauceMaker extends IceCreamMaker {
    @Override
    public void make() {
        super.make();
        System.out.println("Adding flake...");
        System.out.println("Adding raspberry sauce...");
    }
}

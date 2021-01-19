package com.designpatterns.decorator.Original.IceCreamMakers;

public class IceCreamWithFlakeMaker extends IceCreamMaker {
    @Override
    public void make() {
        super.make();
        System.out.println("Adding flake...");
    }
}

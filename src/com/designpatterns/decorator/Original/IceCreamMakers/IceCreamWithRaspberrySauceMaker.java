package com.designpatterns.decorator.Original.IceCreamMakers;

public class IceCreamWithRaspberrySauceMaker extends IceCreamMaker {
    @Override
    public void make() {
        super.make();
        System.out.println("Adding raspberry sauce...");
    }
}

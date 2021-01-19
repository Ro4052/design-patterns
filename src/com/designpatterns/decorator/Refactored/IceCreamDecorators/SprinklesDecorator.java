package com.designpatterns.decorator.Refactored.IceCreamDecorators;

import com.designpatterns.decorator.Refactored.IceCreamMaker;

public class SprinklesDecorator implements IceCreamMaker {
    private IceCreamMaker decoratedIceCreamMaker;

    public SprinklesDecorator(IceCreamMaker decoratedIceCreamMaker) {
        this.decoratedIceCreamMaker = decoratedIceCreamMaker;
    }

    @Override
    public void make() {
        decoratedIceCreamMaker.make();
        System.out.println("Adding sprinkles...");
    }
}

package com.designpatterns.decorator.Refactored.IceCreamDecorators;

import com.designpatterns.decorator.Refactored.IceCreamMaker;

public class SprinklesDecorator extends BaseIceCreamDecorator {
    public SprinklesDecorator(IceCreamMaker decoratedIceCreamMaker) {
        super(decoratedIceCreamMaker);
    }

    @Override
    public void make() {
        decoratedIceCreamMaker.make();
        System.out.println("Adding sprinkles...");
    }
}

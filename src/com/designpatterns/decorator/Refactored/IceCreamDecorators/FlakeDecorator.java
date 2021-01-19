package com.designpatterns.decorator.Refactored.IceCreamDecorators;

import com.designpatterns.decorator.Refactored.IceCreamMaker;

public class FlakeDecorator implements IceCreamMaker {
    private IceCreamMaker decoratedIceCreamMaker;

    public FlakeDecorator(IceCreamMaker decoratedIceCreamMaker) {
        this.decoratedIceCreamMaker = decoratedIceCreamMaker;
    }

    @Override
    public void make() {
        decoratedIceCreamMaker.make();
        System.out.println("Adding flake...");
    }
}

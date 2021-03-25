package com.designpatterns.decorator.Refactored.IceCreamDecorators;

import com.designpatterns.decorator.Refactored.IceCreamMaker;

public class FlakeDecorator extends BaseIceCreamDecorator {
    public FlakeDecorator(IceCreamMaker decoratedIceCreamMaker) {
        super(decoratedIceCreamMaker);
    }

    @Override
    public void make() {
        decoratedIceCreamMaker.make();
        System.out.println("Adding flake...");
    }
}

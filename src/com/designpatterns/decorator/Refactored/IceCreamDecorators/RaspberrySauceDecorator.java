package com.designpatterns.decorator.Refactored.IceCreamDecorators;

import com.designpatterns.decorator.Refactored.IceCreamMaker;

public class RaspberrySauceDecorator extends BaseIceCreamDecorator {
    public RaspberrySauceDecorator(IceCreamMaker decoratedIceCreamMaker) {
        super(decoratedIceCreamMaker);
    }

    @Override
    public void make() {
        decoratedIceCreamMaker.make();
        System.out.println("Adding raspberry sauce...");
    }
}

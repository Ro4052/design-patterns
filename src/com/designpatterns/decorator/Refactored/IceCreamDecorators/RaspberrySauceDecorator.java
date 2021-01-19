package com.designpatterns.decorator.Refactored.IceCreamDecorators;

import com.designpatterns.decorator.Refactored.IceCreamMaker;

public class RaspberrySauceDecorator implements IceCreamMaker {
    private IceCreamMaker decoratedIceCreamMaker;

    public RaspberrySauceDecorator(IceCreamMaker decoratedIceCreamMaker) {
        this.decoratedIceCreamMaker = decoratedIceCreamMaker;
    }

    @Override
    public void make() {
        decoratedIceCreamMaker.make();
        System.out.println("Adding raspberry sauce...");
    }
}

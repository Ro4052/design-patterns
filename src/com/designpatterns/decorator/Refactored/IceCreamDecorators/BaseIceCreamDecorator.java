package com.designpatterns.decorator.Refactored.IceCreamDecorators;

import com.designpatterns.decorator.Refactored.IceCreamMaker;

abstract public class BaseIceCreamDecorator implements IceCreamMaker {
    protected IceCreamMaker decoratedIceCreamMaker;

    protected BaseIceCreamDecorator(IceCreamMaker decoratedIceCreamMaker) {
        this.decoratedIceCreamMaker = decoratedIceCreamMaker;
    }

    @Override
    abstract public void make();
}

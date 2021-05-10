package com.designpatterns.chainofresponsibility.Refactored.Handlers;

public class BasePurchaseHandler implements PurchaseRequestHandler {
    private PurchaseRequestHandler next;

    @Override
    public void setNext(PurchaseRequestHandler nextHandler) {
        next = nextHandler;
    }

    @Override
    public void handle(double requestAmount) {
        if (next != null) {
            next.handle(requestAmount);
        } else {
            System.out.println("No more handlers in the chain!");
        }
    }
}

package com.designpatterns.chainofresponsibility.Refactored.Handlers;

public interface PurchaseRequestHandler {
    void setNext(PurchaseRequestHandler nextHandler);
    void handle(double requestAmount);
}

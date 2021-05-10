package com.designpatterns.chainofresponsibility.Refactored.Handlers;

public class DirectorHandler extends BasePurchaseHandler {
    @Override
    public void handle(double requestAmount) {
        System.out.println("Director: I can approve anything!");
        if (requestAmount < 1000) {
            System.out.println("Director: Approved!");
        } else {
            System.out.println("Director: That's too much!");
        }
    }
}

package com.designpatterns.chainofresponsibility.Refactored.Handlers;

public class ManagerHandler extends BasePurchaseHandler {
    @Override
    public void handle(double requestAmount) {
        if (requestAmount <= 100) {
            System.out.println("Manager: I can approve " + requestAmount + "!");
        } else {
            System.out.println("Manager: I can't approve " + requestAmount + ", passing it up...");
            super.handle(requestAmount);
        }
    }
}

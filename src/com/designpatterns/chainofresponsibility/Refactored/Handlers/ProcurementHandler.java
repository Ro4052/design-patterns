package com.designpatterns.chainofresponsibility.Refactored.Handlers;

public class ProcurementHandler extends BasePurchaseHandler {
    @Override
    public void handle(double requestAmount) {
        if (requestAmount <= 500) {
            System.out.println("Procurement: We can approve " + requestAmount + "!");
        } else {
            System.out.println("Procurement: We can't approve " + requestAmount + ", passing it up...");
            super.handle(requestAmount);
        }
    }
}

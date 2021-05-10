package com.designpatterns.chainofresponsibility.Original;

public class PurchaseRequester {
    public void request(double requestAmount) {
        if (requestAmount <= 100) {
            System.out.println("Manager: I can approve " + requestAmount + "!");
            return;
        }

        System.out.println("Manager: I can't approve " + requestAmount + ", passing it up...");
        if (requestAmount <= 500) {
            System.out.println("Procurement: We can approve " + requestAmount + "!");
            return;
        }

        System.out.println("Procurement: We can't approve " + requestAmount + ", passing it up...");
        System.out.println("Director: I can approve anything!");
        if (requestAmount < 1000) {
            System.out.println("Director: Approved!");
        } else {
            System.out.println("Director: That's too much!");
        }
    }
}

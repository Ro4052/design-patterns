package com.designpatterns.chainofresponsibility.Original;

public class Original {
    public static void run() {
        // Create purchase requester object
        PurchaseRequester purchaseRequester = new PurchaseRequester();

        // Rejected purchase request
        System.out.println("");
        purchaseRequester.request(1211.50);

        // Accepted purchase request
        System.out.println("");
        purchaseRequester.request(22.12);
    }
}

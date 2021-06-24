package com.designpatterns.chainofresponsibility.Refactored;

import com.designpatterns.chainofresponsibility.Refactored.Handlers.*;

public class Refactored {
    public static void handleRequest(PurchaseRequestHandler handler, double amount) {
        System.out.println();
        handler.handle(amount);
    }

    public static void run() {
        // Make some handlers
        ManagerHandler managerHandler = new ManagerHandler();
        ProcurementHandler procurementHandler = new ProcurementHandler();
        DirectorHandler directorHandler = new DirectorHandler();

        // Un-handled purchase request
        managerHandler.setNext(procurementHandler);
        handleRequest(managerHandler, 817.60);

        // Rejected purchase request
        procurementHandler.setNext(directorHandler);
        handleRequest(managerHandler, 1211.50);

        // Accepted purchase request
        handleRequest(managerHandler, 22.12);
    }
}

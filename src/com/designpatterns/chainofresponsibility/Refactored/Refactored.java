package com.designpatterns.chainofresponsibility.Refactored;

import com.designpatterns.chainofresponsibility.Refactored.Handlers.*;

public class Refactored {
    public static void run() {
        // Make some handlers
        ManagerHandler managerHandler = new ManagerHandler();
        ProcurementHandler procurementHandler = new ProcurementHandler();
        DirectorHandler directorHandler = new DirectorHandler();

        // Un-handled purchase request
        System.out.println("");
        managerHandler.setNext(procurementHandler);
        managerHandler.handle(817.60);

        // Rejected purchase request
        System.out.println("");
        procurementHandler.setNext(directorHandler);
        managerHandler.handle(1211.50);

        // Accepted purchase request
        System.out.println("");
        managerHandler.handle(22.12);
    }
}

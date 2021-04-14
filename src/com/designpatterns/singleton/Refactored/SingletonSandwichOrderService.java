package com.designpatterns.singleton.Refactored;

import java.util.ArrayList;
import java.util.List;

public class SingletonSandwichOrderService {
    private static SingletonSandwichOrderService instance;
    private final List<String> sandwiches = new ArrayList<>();

    private SingletonSandwichOrderService() { }

    public static SingletonSandwichOrderService getInstance() {
        if (instance == null) {
            instance = new SingletonSandwichOrderService();
        }

        return instance;
    }

    public void addSandwich(String sandwich) {
        System.out.println("\nOrdering sandwich: " + sandwich);
        sandwiches.add(sandwich);
    }

    public void printAllOrders() {
        System.out.println("\nAll sandwich orders:");
        sandwiches.forEach(System.out::println);
    }
}

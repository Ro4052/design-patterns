package com.designpatterns.singleton.Original;

import java.util.ArrayList;
import java.util.List;

public class SandwichOrderService {
    List<String> sandwiches = new ArrayList<>();

    public void addSandwich(String sandwich) {
        System.out.println("\nOrdering sandwich: " + sandwich);
        sandwiches.add(sandwich);
    }

    public void printAllOrders() {
        System.out.println("\nAll sandwich orders:");
        sandwiches.forEach(System.out::println);
    }
}

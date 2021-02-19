package com.designpatterns.singleton.Refactored;

public class Waiter {
    public void orderSandwich(String sandwich) {
        SingletonSandwichOrderService sandwichOrderService = SingletonSandwichOrderService.getInstance();
        sandwichOrderService.addSandwich(sandwich);
    }
}

package com.designpatterns.singleton.Original;

public class Waiter {
    private SandwichOrderService sandwichOrderService;

    public Waiter(SandwichOrderService sandwichOrderService) {
        this.sandwichOrderService = sandwichOrderService;
    }

    public void orderSandwich(String sandwich) {
        sandwichOrderService.addSandwich(sandwich);
    }
}

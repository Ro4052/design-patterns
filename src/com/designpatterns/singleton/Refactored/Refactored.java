package com.designpatterns.singleton.Refactored;

public class Refactored {
    public static void run() {
        // "Make" some waiters (we don't need to create the order service here)
        Waiter waiter1 = new Waiter();
        Waiter waiter2 = new Waiter();
        Waiter waiter3 = new Waiter();

        // Make some orders
        waiter1.orderSandwich("Ham");
        waiter1.orderSandwich("Cheese and Onion");
        waiter2.orderSandwich("Tuna");
        waiter3.orderSandwich("Chicken and Sweetcorn");
        waiter3.orderSandwich("Cheese and Tomato");

        // Print the orders
        SingletonSandwichOrderService sandwichOrderService = SingletonSandwichOrderService.getInstance();
        sandwichOrderService.printAllOrders();
    }
}

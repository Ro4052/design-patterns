package com.designpatterns.singleton.Original;

public class Original {
    public static void run() {
        // Create the order service
        SandwichOrderService sandwichOrderService = new SandwichOrderService();

        // "Make" some waiters
        Waiter waiter1 = new Waiter(sandwichOrderService);
        Waiter waiter2 = new Waiter(sandwichOrderService);
        Waiter waiter3 = new Waiter(sandwichOrderService);

        // Make some orders
        waiter1.orderSandwich("Ham");
        waiter1.orderSandwich("Cheese and Onion");
        waiter2.orderSandwich("Tuna");
        waiter3.orderSandwich("Chicken and Sweetcorn");
        waiter3.orderSandwich("Cheese and Tomato");

        // Print the orders
        sandwichOrderService.printAllOrders();
    }
}

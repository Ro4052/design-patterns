package com.designpatterns.Observer.Refactored;

import com.designpatterns.Observer.Refactored.DoughnutShops.LargeShop;
import com.designpatterns.Observer.Refactored.DoughnutShops.MediumShop;
import com.designpatterns.Observer.Refactored.DoughnutShops.SmallShop;

public class Refactored {
    public static void run() {
        // Set up the doughnut factory
        DoughnutFactory doughnutFactory = new DoughnutFactory();

        // Set up the doughnut shops
        SmallShop smallShop = new SmallShop();
        MediumShop mediumShop = new MediumShop();
        LargeShop largeShop = new LargeShop();

        // Subscribe the shops to the factory
        doughnutFactory.subscribe(smallShop);
        doughnutFactory.subscribe(mediumShop);
        doughnutFactory.subscribe(largeShop);

        // Add some doughnuts
        doughnutFactory.addDoughnut("strawberry");
        doughnutFactory.addDoughnut("custard");
        doughnutFactory.addDoughnut("chocolate");

        // The small shop has enough doughnuts
        doughnutFactory.unsubscribe(smallShop);

        // Add another doughnut
        doughnutFactory.addDoughnut("raspberry");
    }
}

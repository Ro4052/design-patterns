package com.designpatterns.Observer.Original;

import com.designpatterns.Observer.Original.DoughnutShops.LargeShop;
import com.designpatterns.Observer.Original.DoughnutShops.MediumShop;
import com.designpatterns.Observer.Original.DoughnutShops.SmallShop;

public class Original {
    public static void run() {
        // Set up shops and factory
        SmallShop smallShop = new SmallShop();
        MediumShop mediumShop = new MediumShop();
        LargeShop largeShop = new LargeShop();
        DoughnutFactory doughnutFactory = new DoughnutFactory(smallShop, mediumShop, largeShop);

        // Add some dougnhuts
        doughnutFactory.addDoughnut("strawberry");
        doughnutFactory.addDoughnut("custard");
        doughnutFactory.addDoughnut("chocolate");
        doughnutFactory.addDoughnut("raspberry");
    }
}

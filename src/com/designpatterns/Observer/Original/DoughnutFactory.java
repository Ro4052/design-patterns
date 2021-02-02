package com.designpatterns.Observer.Original;

import com.designpatterns.Observer.Original.DoughnutShops.LargeShop;
import com.designpatterns.Observer.Original.DoughnutShops.MediumShop;
import com.designpatterns.Observer.Original.DoughnutShops.SmallShop;

import java.util.ArrayList;
import java.util.List;

public class DoughnutFactory {
    private List<String> doughnuts = new ArrayList<>();
    private SmallShop smallShop;
    private MediumShop mediumShop;
    private LargeShop largeShop;

    public DoughnutFactory(SmallShop smallShop, MediumShop mediumShop, LargeShop largeShop) {
        this.smallShop = smallShop;
        this.mediumShop = mediumShop;
        this.largeShop = largeShop;
    }

    public void addDoughnut(String doughnut) {
        doughnuts.add(doughnut);
        smallShop.newDoughnutFilling(doughnut);
        mediumShop.latestDoughnutFlavours(doughnuts);
        largeShop.refreshDoughnutFlavours(doughnuts);
    }
}

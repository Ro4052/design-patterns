package com.designpatterns.strategy.Refactored;

import com.designpatterns.strategy.Refactored.Strategies.TeaBrewingStrategy;

public class TeaMaker {
    private TeaBrewingStrategy brewingStrategy;

    public TeaMaker(TeaBrewingStrategy brewingStrategy) {
        setBrewingStrategy(brewingStrategy);
    }

    public void setBrewingStrategy(TeaBrewingStrategy brewingStrategy) {
        this.brewingStrategy = brewingStrategy;
    }

    private void boilWater() {
        System.out.println("\nBoiling water...");
    }

    private void pourTea() {
        System.out.println("Pouring tea");
    }

    public void brewTea() {
        boilWater();
        brewingStrategy.brewTea();
        pourTea();
    }
}

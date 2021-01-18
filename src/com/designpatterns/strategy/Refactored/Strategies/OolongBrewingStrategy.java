package com.designpatterns.strategy.Refactored.Strategies;

public class OolongBrewingStrategy implements TeaBrewingStrategy {
    @Override
    public void brewTea() {
        System.out.println("Brewing Oolong tea...");
    }
}

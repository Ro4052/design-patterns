package com.designpatterns.strategy.Refactored.Strategies;

public class BreakfastBrewingStrategy implements TeaBrewingStrategy {
    @Override
    public void brewTea() {
        System.out.println("Brewing Breakfast tea...");
    }
}

package com.designpatterns.strategy.Refactored.Strategies;

public class EarlGreyBrewingStrategy implements TeaBrewingStrategy {
    @Override
    public void brewTea() {
        System.out.println("Brewing Earl Grey tea...");
    }
}

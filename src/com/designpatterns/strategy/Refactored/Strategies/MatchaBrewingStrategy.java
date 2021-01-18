package com.designpatterns.strategy.Refactored.Strategies;

public class MatchaBrewingStrategy implements TeaBrewingStrategy {
    @Override
    public void brewTea() {
        System.out.println("Brewing Matcha tea...");
    }
}

package com.designpatterns.strategy.Refactored;

import com.designpatterns.strategy.Refactored.Strategies.BreakfastBrewingStrategy;
import com.designpatterns.strategy.Refactored.Strategies.EarlGreyBrewingStrategy;
import com.designpatterns.strategy.Refactored.Strategies.MatchaBrewingStrategy;
import com.designpatterns.strategy.Refactored.Strategies.OolongBrewingStrategy;

public class Refactored {
    public static void run() {
        // Create a tea maker (needs an initial strategy)
        TeaMaker teaMaker = new TeaMaker(new BreakfastBrewingStrategy());

        // Brew some tea! (we can change the type by setting the strategy)
        teaMaker.brewTea();

        teaMaker.setBrewingStrategy(new EarlGreyBrewingStrategy());
        teaMaker.brewTea();

        teaMaker.setBrewingStrategy(new MatchaBrewingStrategy());
        teaMaker.brewTea();

        teaMaker.setBrewingStrategy(new OolongBrewingStrategy());
        teaMaker.brewTea();
    }
}

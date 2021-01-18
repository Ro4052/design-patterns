package com.designpatterns.strategy;

import com.designpatterns.strategy.Original.Original;
import com.designpatterns.strategy.Refactored.Refactored;

public class Strategy {
    public static void main(String[] args) {
        System.out.println("----------");
        System.out.println("Original code");
        Original.run();

        System.out.println("\n----------");
        System.out.println("Refactored code");
        Refactored.run();
    }
}

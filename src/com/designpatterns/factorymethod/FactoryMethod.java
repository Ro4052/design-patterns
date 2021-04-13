package com.designpatterns.factorymethod;

import com.designpatterns.factorymethod.Original.Original;
import com.designpatterns.factorymethod.Refactored.Refactored;

public class FactoryMethod {
    public static void main(String[] args) {
        System.out.println("----------");
        System.out.println("Original code");
        Original.run();

        System.out.println("\n----------");
        System.out.println("Refactored code");
        Refactored.run();
    }
}

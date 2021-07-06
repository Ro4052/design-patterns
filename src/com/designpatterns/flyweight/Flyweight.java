package com.designpatterns.flyweight;

import com.designpatterns.flyweight.Original.Original;
import com.designpatterns.flyweight.Refactored.Refactored;

public class Flyweight {
    public static void main(String[] args) {
        System.out.println("----------");
        System.out.println("Original code");
        Original.run();

        System.out.println("\n----------");
        System.out.println("Refactored code");
        Refactored.run();
    }
}

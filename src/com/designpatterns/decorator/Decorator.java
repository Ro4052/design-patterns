package com.designpatterns.decorator;

import com.designpatterns.decorator.Original.Original;
import com.designpatterns.decorator.Refactored.Refactored;

public class Decorator {
    public static void main(String[] args) {
        System.out.println("----------");
        System.out.println("Original code");
        Original.run();

        System.out.println("\n----------");
        System.out.println("Refactored code");
        Refactored.run();
    }
}

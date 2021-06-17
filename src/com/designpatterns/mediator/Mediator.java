package com.designpatterns.mediator;

import com.designpatterns.mediator.Original.Original;
import com.designpatterns.mediator.Refactored.Refactored;

public class Mediator {
    public static void main(String[] args) {
        System.out.println("----------");
        System.out.println("Original code");
        Original.run();

        System.out.println("\n----------");
        System.out.println("Refactored code");
        Refactored.run();
    }
}

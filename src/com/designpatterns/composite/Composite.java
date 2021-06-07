package com.designpatterns.composite;

import com.designpatterns.composite.Original.Original;
import com.designpatterns.composite.Refactored.Refactored;

public class Composite {
    public static void main(String[] args) {
        System.out.println("----------");
        System.out.println("Original code");
        Original.run();

        System.out.println("\n----------");
        System.out.println("Refactored code");
        Refactored.run();
    }
}

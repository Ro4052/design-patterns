package com.designpatterns.bridge;

import com.designpatterns.bridge.Original.Original;
import com.designpatterns.bridge.Refactored.Refactored;

public class Bridge {
    public static void main(String[] args) {
        System.out.println("----------");
        System.out.println("Original code");
        Original.run();

        System.out.println("\n----------");
        System.out.println("Refactored code");
        Refactored.run();
    }
}

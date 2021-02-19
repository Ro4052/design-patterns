package com.designpatterns.singleton;

import com.designpatterns.singleton.Original.Original;
import com.designpatterns.singleton.Refactored.Refactored;

public class Singleton {
    public static void main(String[] args) {
        System.out.println("----------");
        System.out.println("Original code");
        Original.run();

        System.out.println("\n----------");
        System.out.println("Refactored code");
        Refactored.run();
    }
}

package com.designpatterns.iterator;

import com.designpatterns.iterator.Original.Original;
import com.designpatterns.iterator.Refactored.Refactored;

public class Iterator {
    public static void main(String[] args) {
        System.out.println("----------");
        System.out.println("Original code");
        Original.run();

        System.out.println("\n----------");
        System.out.println("Refactored code");
        Refactored.run();
    }
}

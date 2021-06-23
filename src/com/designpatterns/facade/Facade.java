package com.designpatterns.facade;

import com.designpatterns.facade.Original.Original;
import com.designpatterns.facade.Refactored.Refactored;

public class Facade {
    public static void main(String[] args) {
        System.out.println("----------");
        System.out.println("Original code");
        Original.run();

        System.out.println("\n----------");
        System.out.println("Refactored code");
        Refactored.run();
    }
}

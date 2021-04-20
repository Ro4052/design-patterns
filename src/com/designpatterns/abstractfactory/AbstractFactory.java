package com.designpatterns.abstractfactory;

import com.designpatterns.abstractfactory.Original.Original;
import com.designpatterns.abstractfactory.Refactored.Refactored;

public class AbstractFactory {
    public static void main(String[] args) {
        System.out.println("----------");
        System.out.println("Original code");
        Original.run();

        System.out.println("\n----------");
        System.out.println("Refactored code");
        Refactored.run();
    }
}

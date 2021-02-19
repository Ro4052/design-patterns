package com.designpatterns.observer;

import com.designpatterns.observer.Original.Original;
import com.designpatterns.observer.Refactored.Refactored;

public class Observer {
    public static void main(String[] args) {
        System.out.println("----------");
        System.out.println("Original code");
        Original.run();

        System.out.println("\n----------");
        System.out.println("Refactored code");
        Refactored.run();
    }
}

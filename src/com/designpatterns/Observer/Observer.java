package com.designpatterns.Observer;

import com.designpatterns.Observer.Original.Original;
import com.designpatterns.Observer.Refactored.Refactored;

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

package com.designpatterns.memento;

import com.designpatterns.memento.Original.Original;
import com.designpatterns.memento.Refactored.Refactored;

public class Memento {
    public static void main(String[] args) {
        System.out.println("----------");
        System.out.println("Original code");
        Original.run();

        System.out.println("\n----------");
        System.out.println("Refactored code");
        Refactored.run();
    }
}

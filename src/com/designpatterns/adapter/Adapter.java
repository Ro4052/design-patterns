package com.designpatterns.adapter;

import com.designpatterns.adapter.Original.Original;
import com.designpatterns.adapter.Refactored.Refactored;

public class Adapter {
    public static void main(String[] args) {
        System.out.println("----------");
        System.out.println("Original code");
        Original.run();

        System.out.println("\n----------");
        System.out.println("Refactored code");
        Refactored.run();
    }
}

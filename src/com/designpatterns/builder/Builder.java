package com.designpatterns.builder;

import com.designpatterns.builder.Original.Original;
import com.designpatterns.builder.Refactored.Refactored;

public class Builder {
    public static void main(String[] args) {
        System.out.println("----------");
        System.out.println("Original code");
        Original.run();

        System.out.println("\n----------");
        System.out.println("Refactored code");
        Refactored.run();
    }
}

package com.designpatterns.visitor;

import com.designpatterns.visitor.Original.Original;
import com.designpatterns.visitor.Refactored.Refactored;

public class Visitor {
    public static void main(String[] args) {
        System.out.println("----------");
        System.out.println("Original code");
        Original.run();

        System.out.println("\n----------");
        System.out.println("Refactored code");
        Refactored.run();
    }
}

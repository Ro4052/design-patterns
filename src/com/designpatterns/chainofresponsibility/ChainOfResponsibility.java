package com.designpatterns.chainofresponsibility;

import com.designpatterns.chainofresponsibility.Original.Original;
import com.designpatterns.chainofresponsibility.Refactored.Refactored;

public class ChainOfResponsibility {
    public static void main(String[] args) {
        System.out.println("----------");
        System.out.println("Original code");
        Original.run();

        System.out.println("\n----------");
        System.out.println("Refactored code");
        Refactored.run();
    }
}

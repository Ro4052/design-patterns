package com.designpatterns.prototype;

import com.designpatterns.prototype.Original.Original;
import com.designpatterns.prototype.Refactored.Refactored;

public class Prototype {
    public static void main(String[] args) {
        System.out.println("----------");
        System.out.println("Original code");
        Original.run();

        System.out.println("\n----------");
        System.out.println("Refactored code");
        Refactored.run();
    }
}

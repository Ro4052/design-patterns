package com.designpatterns.proxy;

import com.designpatterns.proxy.Original.Original;
import com.designpatterns.proxy.Refactored.Refactored;

public class Proxy {
    public static void main(String[] args) {
        System.out.println("----------");
        System.out.println("Original code");
        Original.run();

        System.out.println("\n----------");
        System.out.println("Refactored code");
        Refactored.run();
    }
}

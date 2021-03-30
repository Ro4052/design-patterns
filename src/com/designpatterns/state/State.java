package com.designpatterns.state;

import com.designpatterns.state.Original.Original;
import com.designpatterns.state.Refactored.Refactored;

public class State {
    public static void main(String[] args) {
        System.out.println("----------");
        System.out.println("Original code");
        Original.run();

        System.out.println("\n----------");
        System.out.println("Refactored code");
        Refactored.run();
    }
}

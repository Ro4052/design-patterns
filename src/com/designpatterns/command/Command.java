package com.designpatterns.command;

import com.designpatterns.command.Original.Original;
import com.designpatterns.command.Refactored.Refactored;

public class Command {
    public static void main(String[] args) {
        System.out.println("----------");
        System.out.println("Original code");
        Original.run();

        System.out.println("\n----------");
        System.out.println("Refactored code");
        Refactored.run();
    }
}

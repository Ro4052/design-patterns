package com.designpatterns.template;

import com.designpatterns.template.Original.Original;
import com.designpatterns.template.Refactored.Refactored;

public class Template {
    public static void main(String[] args) {
        System.out.println("----------");
        System.out.println("Original code");
        Original.run();

        System.out.println("\n----------");
        System.out.println("Refactored code");
        Refactored.run();
    }
}

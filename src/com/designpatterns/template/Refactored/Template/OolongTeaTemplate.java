package com.designpatterns.template.Refactored.Template;

import com.designpatterns.template.Refactored.TeaMaker;

public class OolongTeaTemplate extends TeaMaker {
    @Override
    protected void boilWater() {
        System.out.println("\nBoiling water to 80 deg...");
    }

    @Override
    protected void brewTea() {
        System.out.println("Brewing Oolong tea...");
    }
}

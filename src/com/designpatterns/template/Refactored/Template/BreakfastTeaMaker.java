package com.designpatterns.template.Refactored.Template;

import com.designpatterns.template.Refactored.TeaMaker;

public class BreakfastTeaMaker extends TeaMaker {
    @Override
    protected void brewTea() {
        System.out.println("Brewing Breakfast tea...");
    }

    @Override
    protected void afterPouringHook() {
        System.out.println("Adding milk...");
    }

    @Override
    protected void serveTea() {
        System.out.println("Serving tea and biscuits...");
    }
}

package com.designpatterns.template.Refactored.Template;

import com.designpatterns.template.Refactored.TeaMaker;

public class EarlGreyTeaMaker extends TeaMaker {
    @Override
    protected void brewTea() {
        System.out.println("Brewing Earl Grey tea...");
    }
}

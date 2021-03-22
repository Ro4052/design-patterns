package com.designpatterns.template.Refactored.Template;

import com.designpatterns.template.Refactored.TeaMaker;

public class EarlGreyTeaTemplate extends TeaMaker {
    @Override
    protected void brewTea() {
        System.out.println("Brewing Earl Grey tea...");
    }
}

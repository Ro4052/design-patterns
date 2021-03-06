package com.designpatterns.template.Refactored;

abstract public class TeaMaker {
    protected void boilWater() {
        System.out.println("\nBoiling water to 100deg...");
    }

    abstract protected void brewTea();

    protected final void pourTea() {
        System.out.println("Pouring tea...");
    }

    protected void afterPouringHook() { }

    protected void serveTea() {
        System.out.println("Serving tea...");
    }

    public final void makeTea() {
        boilWater();
        brewTea();
        pourTea();
        afterPouringHook();
        serveTea();
    }
}

package com.designpatterns.template.Original;

public class Original {
    public static void run() {
        // Create a tea maker
        TeaMaker teaMaker = new TeaMaker();

        // Make some tea!
        teaMaker.makeTea("Breakfast");
        teaMaker.makeTea("Earl Grey");
        teaMaker.makeTea("Matcha");
        teaMaker.makeTea("Oolong");
        teaMaker.makeTea("Darjeeling");
    }
}

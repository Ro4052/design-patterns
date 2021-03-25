package com.designpatterns.decorator.Refactored;

import com.designpatterns.decorator.Refactored.IceCreamDecorators.*;

public class Refactored {
    public static void run() {
        // Make normal ice cream
        IceCreamMaker normalIceCreamMaker = new PlainIceCreamMaker();
        normalIceCreamMaker.make();

        // Make ice cream with sprinkles
        IceCreamMaker iceCreamWithSprinklesMaker = new SprinklesDecorator(normalIceCreamMaker);
        iceCreamWithSprinklesMaker.make();

        // Make ice cream with flake
        IceCreamMaker iceCreamWithFlakeMaker = new FlakeDecorator(normalIceCreamMaker);
        iceCreamWithFlakeMaker.make();

        // Make ice cream with raspberry sauce
        IceCreamMaker iceCreamWithRaspberrySauceMaker = new RaspberrySauceDecorator(normalIceCreamMaker);
        iceCreamWithRaspberrySauceMaker.make();

        // Make ice cream with flake and raspberry sauce
        IceCreamMaker iceCreamWithFlakeAndRaspberrySauceMaker = new RaspberrySauceDecorator(iceCreamWithFlakeMaker);
        iceCreamWithFlakeAndRaspberrySauceMaker.make();
    }
}

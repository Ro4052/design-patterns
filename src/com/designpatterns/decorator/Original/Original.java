package com.designpatterns.decorator.Original;

import com.designpatterns.decorator.Original.IceCreamMakers.*;

public class Original {
    public static void run() {
        // Make normal ice cream
        IceCreamMaker iceCreamMaker = new IceCreamMaker();
        iceCreamMaker.make();

        // Make ice cream with sprinkles
        IceCreamWithSprinklesMaker iceCreamWithSprinklesMaker = new IceCreamWithSprinklesMaker();
        iceCreamWithSprinklesMaker.make();

        // Make ice cream with flake
        IceCreamWithFlakeMaker iceCreamWithFlakeMaker = new IceCreamWithFlakeMaker();
        iceCreamWithFlakeMaker.make();

        // Make ice cream with raspberry sauce
        IceCreamWithRaspberrySauceMaker iceCreamWithRaspberrySauceMaker = new IceCreamWithRaspberrySauceMaker();
        iceCreamWithRaspberrySauceMaker.make();

        // Make ice cream with flake and raspberry sauce
        IceCreamWithFlakeAndRaspberrySauceMaker iceCreamWithFlakeAndRaspberrySauce = new IceCreamWithFlakeAndRaspberrySauceMaker();
        iceCreamWithFlakeAndRaspberrySauce.make();
    }
}

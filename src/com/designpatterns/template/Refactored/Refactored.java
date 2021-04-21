package com.designpatterns.template.Refactored;

import com.designpatterns.template.Refactored.Template.BreakfastTeaMaker;
import com.designpatterns.template.Refactored.Template.EarlGreyTeaMaker;
import com.designpatterns.template.Refactored.Template.MatchaTeaMaker;
import com.designpatterns.template.Refactored.Template.OolongTeaMaker;

public class Refactored {
    public static void run() {
        // Make Breakfast tea
        TeaMaker breakfastTeaMaker = new BreakfastTeaMaker();
        breakfastTeaMaker.makeTea();

        // Make Earl Grey tea
        TeaMaker earlGreyTeaMaker = new EarlGreyTeaMaker();
        earlGreyTeaMaker.makeTea();

        // Make Matcha tea
        TeaMaker matchaTeaMaker = new MatchaTeaMaker();
        matchaTeaMaker.makeTea();

        // Make Oolong tea
        TeaMaker oolongTeaMaker = new OolongTeaMaker();
        oolongTeaMaker.makeTea();
    }
}

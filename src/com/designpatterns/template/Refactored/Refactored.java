package com.designpatterns.template.Refactored;

import com.designpatterns.template.Refactored.Template.BreakfastTeaTemplate;
import com.designpatterns.template.Refactored.Template.EarlGreyTeaTemplate;
import com.designpatterns.template.Refactored.Template.MatchaTeaTemplate;
import com.designpatterns.template.Refactored.Template.OolongTeaTemplate;

public class Refactored {
    public static void run() {
        // Make Breakfast tea
        TeaMaker breakfastTeaMaker = new BreakfastTeaTemplate();
        breakfastTeaMaker.makeTea();

        // Make Earl Grey tea
        TeaMaker earlGreyTeaMaker = new EarlGreyTeaTemplate();
        earlGreyTeaMaker.makeTea();

        // Make Matcha tea
        TeaMaker matchaTeaMaker = new MatchaTeaTemplate();
        matchaTeaMaker.makeTea();

        // Make Oolong tea
        TeaMaker oolongTeaMaker = new OolongTeaTemplate();
        oolongTeaMaker.makeTea();
    }
}

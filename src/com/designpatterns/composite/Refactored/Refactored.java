package com.designpatterns.composite.Refactored;

import com.designpatterns.composite.Refactored.Watercourses.*;

import java.math.BigDecimal;

public class Refactored {
    public static Watercourse createWatercourseSystem() {
        // Create watercourses
        River avon = new River("Avon", new BigDecimal(154));
        River frome = new River("Frome", new BigDecimal(32));
        Brook henhambridge = new Brook("Henhambridge", new BigDecimal("1.78"));
        River mells = new River("Mells", new BigDecimal(8));
        Brook egford = new Brook("Egford", new BigDecimal(2));
        Brook marston = new Brook("Marston", new BigDecimal(1));
        Brook wid = new Brook("Wid", new BigDecimal(2));
        River biss = new River("Biss", new BigDecimal(18));
        Brook bitham = new Brook("Bitham", new BigDecimal(2));
        Brook bissBrook = new Brook("Biss", new BigDecimal(6));
        Brook brinkworth = new Brook("Brinkworth", new BigDecimal("8.7"));

        // Create the composite system
        avon.addTributary(frome);
        avon.addTributary(wid);
        avon.addTributary(biss);
        avon.addTributary(brinkworth);

        frome.addTributary(henhambridge);
        frome.addTributary(mells);
        frome.addTributary(marston);

        mells.addTributary(egford);

        biss.addTributary(bitham);
        biss.addTributary(bissBrook);

        return avon;
    }

    public static void printTotalWatercourseSystemLength(Watercourse watercourse) {
        System.out.println("\nTotal watercourse system length: " + watercourse.getWatercourseLength());
    }

    public static void run() {
        System.out.println();
        printTotalWatercourseSystemLength(createWatercourseSystem());
    }
}

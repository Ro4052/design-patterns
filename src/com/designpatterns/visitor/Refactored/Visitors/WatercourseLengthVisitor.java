package com.designpatterns.visitor.Refactored.Visitors;

import com.designpatterns.visitor.Refactored.Watercourses.*;

public class WatercourseLengthVisitor implements Visitor {
    public void printWatercourse(Watercourse mainWatercourse) {
        System.out.println(mainWatercourse.accept(this));
    }

    @Override
    public String visitBrook(Brook brook) {
        return getWatercourseDetails(brook);
    }

    @Override
    public String visitRiver(River river) {
        StringBuilder stringBuilder = new StringBuilder(getWatercourseDetails(river));
        for (Watercourse tributary : river.getTributaries()) {
            String children = tributary.accept(this).replace("\n  ", "\n    ");
            stringBuilder.append("\n  ").append(children);
        }

        return stringBuilder.toString();
    }

    private String getWatercourseDetails(Watercourse watercourse) {
        return watercourse.getName() + ": " + watercourse.getLength() + "km";
    }
}

package com.designpatterns.visitor.Refactored.Visitors;

import com.designpatterns.visitor.Refactored.Watercourses.*;

public class SimpleWatercourseVisitor implements Visitor {
    public void printWatercourse(Watercourse mainWatercourse) {
        System.out.println(mainWatercourse.accept(this));
    }

    @Override
    public String visitBrook(Brook brook) {
        return brook.getName();
    }

    @Override
    public String visitRiver(River river) {
        StringBuilder stringBuilder = new StringBuilder(river.getName());
        for (Watercourse tributary : river.getTributaries()) {
            String children = tributary.accept(this).replace("\n  ", "\n    ");
            stringBuilder.append("\n  ").append(children);
        }

        return stringBuilder.toString();
    }
}

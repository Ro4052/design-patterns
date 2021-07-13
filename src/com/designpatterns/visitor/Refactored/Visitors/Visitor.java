package com.designpatterns.visitor.Refactored.Visitors;

import com.designpatterns.visitor.Refactored.Watercourses.*;

public interface Visitor {
    String visitRiver(River river);
    String visitBrook(Brook brook);
}

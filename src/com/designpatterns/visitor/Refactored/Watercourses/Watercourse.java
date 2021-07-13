package com.designpatterns.visitor.Refactored.Watercourses;

import com.designpatterns.visitor.Refactored.Visitors.Visitor;

import java.math.BigDecimal;

public interface Watercourse {
    String getName();
    BigDecimal getLength();
    String accept(Visitor visitor);
}

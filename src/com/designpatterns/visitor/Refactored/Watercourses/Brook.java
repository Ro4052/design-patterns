package com.designpatterns.visitor.Refactored.Watercourses;

import com.designpatterns.visitor.Refactored.Visitors.Visitor;

import java.math.BigDecimal;

public class Brook implements Watercourse {
    private final String name;
    private final BigDecimal lengthInKm;

    public Brook(String name, BigDecimal lengthInKm) {
        this.name = name;
        this.lengthInKm = lengthInKm;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getLength() {
        return lengthInKm;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitBrook(this);
    }
}

package com.designpatterns.visitor.Refactored.Watercourses;

import com.designpatterns.visitor.Refactored.Visitors.Visitor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class River implements Watercourse {
    private final String name;
    private final BigDecimal lengthInKm;
    private final List<Watercourse> tributaries = new ArrayList<>();

    public River(String name, BigDecimal lengthInKm) {
        this.name = name;
        this.lengthInKm = lengthInKm;
    }

    public void addTributary(Watercourse tributary) {
        tributaries.add(tributary);
    }

    public List<Watercourse> getTributaries() {
        return tributaries;
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
        return visitor.visitRiver(this);
    }
}

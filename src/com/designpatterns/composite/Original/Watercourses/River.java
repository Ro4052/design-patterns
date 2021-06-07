package com.designpatterns.composite.Original.Watercourses;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class River extends Watercourse {
    private final List<Watercourse> tributaries = new ArrayList<>();

    public River(String name, BigDecimal lengthInKm) {
        super(name, lengthInKm);
    }

    public void addTributary(Watercourse tributary) {
        tributaries.add(tributary);
    }

    public List<Watercourse> getTriburaties() {
        return tributaries;
    }

    public BigDecimal getWatercourseLength() {
        System.out.println("Getting river length for " + name + "...");

        return super.getWatercourseLength();
    }
}

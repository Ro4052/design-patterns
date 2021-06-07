package com.designpatterns.composite.Refactored.Watercourses;

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

    @Override
    public BigDecimal getWatercourseLength() {
        System.out.println("Getting river and tributaries lengths for " + name + "...");
        BigDecimal tributariesLength = tributaries
                .stream()
                .reduce(BigDecimal.ZERO, (totalLength, tributary) -> totalLength.add(tributary.getWatercourseLength()), BigDecimal::add);

        return lengthInKm.add(tributariesLength);
    }
}

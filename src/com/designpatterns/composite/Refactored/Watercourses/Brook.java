package com.designpatterns.composite.Refactored.Watercourses;

import java.math.BigDecimal;

public class Brook implements Watercourse {
    private final String name;
    private final BigDecimal lengthInKm;

    public Brook(String name, BigDecimal lengthInKm) {
        this.name = name;
        this.lengthInKm = lengthInKm;
    }

    @Override
    public BigDecimal getWatercourseLength() {
        System.out.println("Getting brook length for " + name + "...");
        return lengthInKm;
    }
}

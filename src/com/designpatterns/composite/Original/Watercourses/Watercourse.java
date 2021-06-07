package com.designpatterns.composite.Original.Watercourses;

import java.math.BigDecimal;

public abstract class Watercourse {
    protected final String name;
    protected final BigDecimal lengthInKm;

    public Watercourse(String name, BigDecimal lengthInKm) {
        this.name = name;
        this.lengthInKm = lengthInKm;
    }

    public BigDecimal getWatercourseLength() {
        return lengthInKm;
    };
}

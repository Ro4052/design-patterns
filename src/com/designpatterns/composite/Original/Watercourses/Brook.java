package com.designpatterns.composite.Original.Watercourses;

import java.math.BigDecimal;

public class Brook extends Watercourse {
    public Brook(String name, BigDecimal lengthInKm) {
        super(name, lengthInKm);
    }

    public BigDecimal getWatercourseLength() {
        System.out.println("Getting brook length for " + name + "...");

        return super.getWatercourseLength();
    }
}

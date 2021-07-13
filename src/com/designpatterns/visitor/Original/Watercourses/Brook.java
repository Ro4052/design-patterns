package com.designpatterns.visitor.Original.Watercourses;

import java.math.BigDecimal;

public class Brook implements Watercourse {
    private final String name;
    private final BigDecimal lengthInKm;

    public Brook(String name, BigDecimal lengthInKm) {
        this.name = name;
        this.lengthInKm = lengthInKm;
    }

    @Override
    public String simpleExport() {
        return name;
    }

    @Override
    public String lengthExport() {
        return name + ": " + lengthInKm + "km";
    }
}

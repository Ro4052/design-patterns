package com.designpatterns.visitor.Original.Watercourses;

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
    public String simpleExport() {
        StringBuilder stringBuilder = new StringBuilder(name);
        for (Watercourse tributary : tributaries) {
            String children = tributary.simpleExport().replace("\n  ", "\n    ");
            stringBuilder.append("\n  ").append(children);
        }

        return stringBuilder.toString();
    }

    @Override
    public String lengthExport() {
        StringBuilder stringBuilder = new StringBuilder(name + ": " + lengthInKm + "km");
        for (Watercourse tributary : tributaries) {
            String children = tributary.lengthExport().replace("\n  ", "\n    ");
            stringBuilder.append("\n  ").append(children);
        }

        return stringBuilder.toString();
    }
}

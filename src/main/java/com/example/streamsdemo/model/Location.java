package com.example.streamsdemo.model;

public enum Location {
    HAMBURG(1_900_000), COLOGNE(1_000_000), FRANKFURT(750_000), MUNICH(1_500_000);

    public final int population;

    Location(int population) {
        this.population = population;
    }

}

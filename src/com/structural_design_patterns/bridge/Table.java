package com.structural_design_patterns.bridge;

public class Table extends Place {
    public Table(PlaceType placeType) {
        super(placeType);
    }

    @Override
    public void arrange() {
        System.out.println("Your table is arranged!");
        placeType.set();
    }
}

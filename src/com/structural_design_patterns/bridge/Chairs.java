package com.structural_design_patterns.bridge;

public class Chairs extends Place {
    public Chairs(PlaceType placeType) {
        super(placeType);
    }

    @Override
    public void arrange() {
        System.out.println("Your chairs are arranged!");
        placeType.set();
    }
}

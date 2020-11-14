package com.structural_design_patterns.bridge;

public abstract class Place {
    protected PlaceType placeType;

    public Place(PlaceType placeType) {
        this.placeType = placeType;
    }

    abstract public void arrange();
}

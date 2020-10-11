package com.creational_design_patterns.Hamburgers;

public abstract class Hamburger {
    public String dimensions;
    public String meatType;
    public String bun;
    public int meat;

    public Hamburger() { }

    public Hamburger(Hamburger component) {
        if (component != null) {
            this.dimensions = component.dimensions;
            this.meatType = component.meatType;
            this.bun = component.bun;
            this.meat = component.meat;
        }
    }

    public abstract Hamburger clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hamburger that = (Hamburger) o;
        return dimensions == that.dimensions &&
                meatType == that.meatType &&
                bun == that.bun && meat==that.meat ;
    }
}

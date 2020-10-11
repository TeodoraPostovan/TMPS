package com.creational_design_patterns.Hamburgers;

public class Vegetarian  extends Hamburger {
    public String burgerType;

    public Vegetarian() {
    }

    public Vegetarian(Vegetarian target) {
        super(target);
        if (target != null) {
            this.burgerType = target.burgerType;
        }
    }

    @Override
    public Hamburger clone() {
        return new Vegetarian(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vegetarian vegetarian = (Vegetarian) o;
        return burgerType.equals(vegetarian.burgerType);
    }

    @Override
    public String toString() {
        return "Vegetarian " +
                ", burgerType='" + burgerType + '\'' +
                ", dimensions='" + dimensions + '\'' +
                ", meat='" + meat + '\'' +
                ", meatType='" + meatType + '\'' +
                ", bun='" + bun + '\'';

    }
}
package com.creational_design_patterns.Hamburgers;

public class ClassicBurger extends Hamburger {
    public String burgerType;

    public ClassicBurger() {
    }

    public ClassicBurger(ClassicBurger target) {
        super(target);
        if (target != null) {
            this.burgerType = target.burgerType;
        }
    }

    @Override
    public Hamburger clone() {
        return new ClassicBurger(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ClassicBurger classic = (ClassicBurger) o;
        return burgerType.equals(classic.burgerType);
    }

    @Override
    public String toString() {
        return "ClassicBurger " +
                ", burgerType='" + burgerType + '\'' +
                ", dimensions='" + dimensions + '\'' +
                ", meat='" + meat + '\'' +
                ", meatType='" + meatType + '\'' +
                ", bun='" + bun + '\'';
    }
}

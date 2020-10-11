package com.creational_design_patterns.Drinks;

import com.creational_design_patterns.Drinks.Drinks;

public class Milkshake implements Drinks {
    @Override
    public void addDrink() {
        System.out.println("Milkshake added to the meal");
    }
}

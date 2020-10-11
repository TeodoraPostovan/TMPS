package com.creational_design_patterns.Factories;

import com.creational_design_patterns.Desserts.Desserts;
import com.creational_design_patterns.Drinks.Drinks;
import com.creational_design_patterns.Salads.Salad;

public interface MealFactory {
    Desserts addDessert();
    Drinks addDrink();
    Salad addSalad();
}

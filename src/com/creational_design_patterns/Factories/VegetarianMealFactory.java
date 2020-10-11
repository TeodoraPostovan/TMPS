package com.creational_design_patterns.Factories;

import com.creational_design_patterns.Desserts.BakedPears;
import com.creational_design_patterns.Desserts.Desserts;
import com.creational_design_patterns.Drinks.Drinks;
import com.creational_design_patterns.Drinks.MultifruitJuice;
import com.creational_design_patterns.Salads.SpringSalad;
import com.creational_design_patterns.Salads.Salad;

public class VegetarianMealFactory implements MealFactory {
    @Override
    public Desserts addDessert() {return new BakedPears();}
    @Override
    public Drinks addDrink() {return new MultifruitJuice();}
    @Override
    public Salad addSalad() {return new SpringSalad();}

}



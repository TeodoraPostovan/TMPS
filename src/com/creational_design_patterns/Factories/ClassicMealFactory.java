package com.creational_design_patterns.Factories;

import com.creational_design_patterns.Salads.CaesarSalad;
import com.creational_design_patterns.Salads.Salad;
import com.creational_design_patterns.Drinks.Drinks;
import com.creational_design_patterns.Drinks.Milkshake;
import com.creational_design_patterns.Desserts.Desserts;
import  com.creational_design_patterns.Desserts.Cheesecake;

public class ClassicMealFactory implements MealFactory {
    @Override
    public Desserts addDessert() {return new Cheesecake();}
    @Override
    public Drinks addDrink() {return new Milkshake();}
    @Override
    public Salad addSalad() {return new CaesarSalad();}

}

package com.creational_design_patterns;

import java.util.Scanner;
import com.creational_design_patterns.Factories.MealFactory;
import com.creational_design_patterns.Factories.ClassicMealFactory;
import com.creational_design_patterns.Factories.VegetarianMealFactory;
import com.creational_design_patterns.Hamburgers.ClassicBurger;
import com.creational_design_patterns.Hamburgers.Vegetarian;

public class Buyer {
    public static void main(String[] args) {
        Meal.getMeal();
        try {
            Meal.buildMeal();
        } catch(NullPointerException e){
            System.err.println("You don't have a Meal we can give.");
        }
    }
}

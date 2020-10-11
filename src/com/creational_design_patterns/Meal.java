package com.creational_design_patterns;

import java.util.Scanner;
import com.creational_design_patterns.Desserts.Desserts;
import com.creational_design_patterns.Drinks.Drinks;
import com.creational_design_patterns.Salads.Salad;
import com.creational_design_patterns.Hamburgers.Vegetarian;
import com.creational_design_patterns.Hamburgers.ClassicBurger;
import com.creational_design_patterns.Factories.MealFactory;
import com.creational_design_patterns.Factories.VegetarianMealFactory;
import com.creational_design_patterns.Factories.ClassicMealFactory;


public class Meal {
    private static Desserts dessert;
    private static Drinks drink;
    private static Salad salad;

    public Meal(MealFactory mealFactory) {
        dessert = mealFactory.addDessert();
        drink = mealFactory.addDrink();
        salad = mealFactory.addSalad();
    }

    public static void buildMeal(){
        salad.addSalad();
        salad.extra();
        drink.addDrink();
        dessert.addDessert();
    }

    public static Meal getMeal(){
        Meal meal = null;
        MealFactory mealFactory;

        Scanner response = new Scanner(System.in);
        System.out.println("Enter Meal type:");
        String pcType = response.nextLine();

        if(pcType.equalsIgnoreCase("Vegetarian")){
            mealFactory = new VegetarianMealFactory();
            meal = new Meal(mealFactory);

            Vegetarian vegetarian = new Vegetarian();
            vegetarian.dimensions= "L";
            vegetarian.meat= 2;
            vegetarian.meatType = "of soy";
            vegetarian.bun = "integral";
            vegetarian.burgerType= "vegetarian";

            Scanner vegetarianResponse = new Scanner(System.in);
            System.out.println("Do you want another burger? yes/no");
            String extraBurger = vegetarianResponse.nextLine();

            if(extraBurger.equals("yes")){
                Vegetarian secondVegetarian = (Vegetarian) vegetarian.clone();
                System.out.println("Added second identical vegetarian burger \n" +
                        "Burger1 - " + vegetarian.toString() + "\nBurger2 - " + secondVegetarian.toString());
            } else {
                System.out.println("Your vegetarian meal is ready.");
            }

        } else if (pcType.equalsIgnoreCase("Classic")){
            mealFactory = new ClassicMealFactory();
            meal = new Meal(mealFactory);

            ClassicBurger classic = new ClassicBurger();
            classic.dimensions = "S";
            classic.meat = 1;
            classic.meatType = "Chicken";
            classic.bun = "Fried in egg";
            classic.burgerType= "classic";

            Scanner classicResponse = new Scanner(System.in);
            System.out.println("Do you want another burger? yes/no");
            String extraBurger = classicResponse.nextLine();

            if(extraBurger.equals("yes")){
                ClassicBurger secondBurger = (ClassicBurger) classic.clone();
                System.out.println("Added second identical classic burger\n" +
                        "Burger1 - " + classic.toString() + "\nBurger2 - " + secondBurger.toString());
            } else {
                System.out.println("Your classic meal is ready.");
            }

        } else {
            System.out.println("Can't build such meal.");
        }
        return meal;
    }

}

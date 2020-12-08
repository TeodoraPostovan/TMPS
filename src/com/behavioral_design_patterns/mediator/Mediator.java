package com.behavioral_design_patterns.mediator;
import com.creational_design_patterns.Meal;

public class Mediator {
    Meal preparedMeal;

    public enum MealStatus {
        NOT_CHECKED, PREPARED, NOT_ENOUGH_INGREDIENTS, READY
    }

    public void checkMeal(Meal meal) {
        if (meal.status == MealStatus.PREPARED) {
            preparedMeal = meal;
            System.out.println("Meal is prepared, ready to be served");
        } else {
            meal.status = MealStatus.NOT_ENOUGH_INGREDIENTS;
            preparedMeal = meal;
            System.out.println("In the meal must be added some ingredients");
        }
    }

    public void add(Meal meal) {
        checkMeal(meal);
        if (meal.status.equals(MealStatus.NOT_ENOUGH_INGREDIENTS)) {
            System.out.println("The meal is completed...\n Sorry for inconvenience");
            meal.status = MealStatus.READY;
        } else {
            System.out.println("Your meal is ready, no need to wait for other ingredients");
        }
    }
}

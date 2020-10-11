package com.creational_design_patterns.Salads;

public class SpringSalad implements Salad {
    @Override
    public void addSalad() {
        System.out.println("Spring salad added to the meal");
    }
    @Override
    public void extra() {
        System.out.println("Extra lemon sauce");
    }
}

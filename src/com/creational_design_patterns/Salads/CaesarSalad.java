package com.creational_design_patterns.Salads;

public class CaesarSalad  implements Salad {
    @Override
    public void addSalad() {
        System.out.println("Caesar salad added to the meal");
    }
    @Override
    public void extra() {
        System.out.println("Extra parmesan");
    }
}

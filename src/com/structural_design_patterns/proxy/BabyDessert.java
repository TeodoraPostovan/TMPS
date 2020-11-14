package com.structural_design_patterns.proxy;
import com.creational_design_patterns.Desserts.Desserts;

public class BabyDessert implements Desserts {
    private final String component;

    public BabyDessert(String component) {
        this.component = component;
        serve(component);
    }

    public void serve(String currentComponent){
        System.out.println("The " + currentComponent +" is preparing...");
    }

    @Override
    public void addDessert() {
        System.out.println("The " + component + "is served");
    }
}

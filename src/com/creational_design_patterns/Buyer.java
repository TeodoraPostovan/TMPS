package com.creational_design_patterns;

import com.creational_design_patterns.Desserts.Desserts;
import com.structural_design_patterns.adapter.AdapterForChildrenCutlery;
import com.structural_design_patterns.adapter.CutleryForAdults;
import com.structural_design_patterns.adapter.CutleryForChildren;
import com.structural_design_patterns.adapter.Plate;
import com.structural_design_patterns.bridge.*;
import com.structural_design_patterns.proxy.BananaPudding;

public class Buyer {

    public static void main(String[] args) {
        Place chairs = new Chairs(new Standard());
        Place table = new Table(new Standard());

        CutleryForAdults cutleryForAdults = new  CutleryForAdults("CA");
        Plate plate = new Plate("CA");

        CutleryForChildren cutleryForChildren = new CutleryForChildren("CC");
        AdapterForChildrenCutlery adapterForChildrenCutlery = new AdapterForChildrenCutlery(cutleryForChildren);

        Desserts desserts = new BananaPudding("Yummy Baby Dessert ");

        Meal.getMeal();
        try {
            Meal.buildMeal();
        } catch(NullPointerException e){
            System.err.println("You don't have a Meal we can give.");
        }

        chairs.arrange();
        table.arrange();

        if(plate.setCutleryForAdults(cutleryForAdults)){
           System.out.println("Cutlery for adults are arranged!");
        }

        if(plate.setCutleryForAdults(adapterForChildrenCutlery)){
            System.out.println("Cutlery for children are arranged(with adapter).");
        }

        //proxy
        desserts.addDessert();

    }

    }


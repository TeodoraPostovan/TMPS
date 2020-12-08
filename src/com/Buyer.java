package com;

import com.creational_design_patterns.Desserts.Desserts;
import com.creational_design_patterns.Meal;
import com.structural_design_patterns.adapter.AdapterForChildrenCutlery;
import com.structural_design_patterns.adapter.CutleryForAdults;
import com.structural_design_patterns.adapter.CutleryForChildren;
import com.structural_design_patterns.adapter.Plate;
import com.structural_design_patterns.bridge.*;
import com.structural_design_patterns.proxy.BananaPudding;
import com.behavioral_design_patterns.command.TableCommodities;
import com.behavioral_design_patterns.mediator.Mediator;
import com.structural_design_patterns.bridge.Table;

import java.util.Scanner;

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

        //mediator
        Scanner scan = new Scanner(System.in);

        // Object initialization block
        Mediator mediator = new Mediator();
        Meal inOperationPC;
        Meal order1 = new Meal(mediator, "Vegetarian1 Teo");
        Meal order2 = new Meal(mediator, "Classic10 Alexa");
        Meal order3 = new Meal(Mediator.MealStatus.NOT_ENOUGH_INGREDIENTS, mediator, "Vegetarian3 Pitter");

        // User input block
        String repeatRunFlag = "yes";
        while (!repeatRunFlag.equalsIgnoreCase("no")) {
            System.out.println("Which order do you want to check? ");
            System.out.println("press 1 for Teo's");
            System.out.println("press 2 for Alexa's");
            System.out.println("press 3 for Pitter's");

            int choice = scan.nextInt();
            if (choice == 1) {
                inOperationPC = order1;
            } else if (choice == 2) {
                inOperationPC = order2;
            } else {
                inOperationPC = order3;
            }
            System.out.println("What do you want to do with the order? " + inOperationPC.name);
            System.out.println("Press 1 to check ");
            System.out.println("Press 2 to add ingredients ");

            int type = scan.nextInt();
            try {
                switch (type) {
                    case 1:
                        inOperationPC.checkMeal();
                        break;
                    case 2:
                        inOperationPC.add();
                        break;

                }
            } catch (Exception e1) {
                System.out.println("# Access denied #");
            }
            System.out.println("Press No to Exit or any other character to continue");
            try {
                repeatRunFlag = scan.next();
            } catch (Exception e) {
                repeatRunFlag = "no";
            }
        }

        //command
        scan = new Scanner(System.in);
        int flag = 1;
        TableCommodities commodities = new TableCommodities((Table) table);
        commodities.load();
        while (flag == 1) {
            System.out.println("Please press any command between 1 to 10 for operation\n" +
                    "1.        LightON\n" +
                    "2.        lightOff\n" +
                    "3.        TvON\n" +
                    "4.        TvOFF\n" +
                    "5.        StopCommandSet\n" +
                    "6.        CommandHandler\n" +
                    "7.        MusicOFF\n" +
                    "8.        MusicON\n" +
                    "9.        MusicVolumeUP\n" +
                    "10.       MusicVolumeDown\n");

            int buttonNumber = scan.nextInt();
            ((Table) table).buttonPress(buttonNumber);

            System.out.println("\nPress 1 for yes and 0 or other digits to EXIT ");
            try {
                flag = scan.nextInt();
            } catch (Exception e) {
                flag = 0;
            }
        }
    }
}



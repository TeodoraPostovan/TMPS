package com.structural_design_patterns.bridge;

import com.structural_design_patterns.PlaceColor;

public class Standard implements PlaceType{
    @Override
    public String getType() {
        return "Standard";
    }

    @Override
    public void set() {
        System.out.println(PlaceColor.GREEN_BOLD + "Standard place is ready!"+ PlaceColor.RESET);
    }
}

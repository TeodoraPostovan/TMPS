package com.structural_design_patterns.bridge;
import com.structural_design_patterns.PlaceColor;

public class Private implements PlaceType {
    @Override
    public String getType() {
        return "Private";
    }

    @Override
    public void set() {
        System.out.println(PlaceColor.RED_BOLD + "Private place is ready!"+ PlaceColor.RESET);
    }
}

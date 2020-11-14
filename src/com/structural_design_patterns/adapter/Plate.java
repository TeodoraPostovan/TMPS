package com.structural_design_patterns.adapter;

public class Plate {
    private String requiredCutlery;

    public Plate() { }

    public Plate(String requiredCutlery) {
        this.requiredCutlery = requiredCutlery;
    }

    public String getCutlery(){
        return requiredCutlery;
    }

    public boolean setCutleryForAdults(CutleryForAdults cutleryForAdults){
        boolean result;
        result = (this.requiredCutlery.equalsIgnoreCase("CA"));
        return result;
    }
}

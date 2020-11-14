package com.structural_design_patterns.adapter;

public class CutleryForAdults {
    private String cutlery;

    public CutleryForAdults() { }

    public CutleryForAdults(String cutlery) {
        this.cutlery = cutlery;
    }

    public String getCutlery() {
        return cutlery;
    }
}

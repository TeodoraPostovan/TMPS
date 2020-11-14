package com.structural_design_patterns.adapter;

public class CutleryForChildren {
    private String cutlery;

    public CutleryForChildren() { }

    public CutleryForChildren(String cutlery) {
        this.cutlery = cutlery;
    }

    public String getCutlery() {
        return cutlery;
    }
}

package com.structural_design_patterns.adapter;

public class AdapterForChildrenCutlery extends CutleryForAdults {
    private CutleryForChildren cutleryForChildren;

    public AdapterForChildrenCutlery(CutleryForChildren cutleryForChildren){
        this.cutleryForChildren = cutleryForChildren;
    }

    public String setAdapter(){
        return "Adapter set for children's cutlery";
    }
}

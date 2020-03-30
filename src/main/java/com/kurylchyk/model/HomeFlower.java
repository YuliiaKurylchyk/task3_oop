package com.kurylchyk.model;

public class HomeFlower extends Flower {

    private Pot pot;

    public HomeFlower(String sort, String name){
        super(sort,name);
        pot = new Pot();
    }

    @Override
    public String toString() {
        return super.toString() +" with " +  pot.toString();
    }
}

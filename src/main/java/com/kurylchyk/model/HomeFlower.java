package com.kurylchyk.model;

public class HomeFlower extends Flower {

    Pot pot;

    public HomeFlower(String sort, String name){
        super(sort,name);
        pot = new Pot();
    }

}

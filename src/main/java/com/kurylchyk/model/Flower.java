package com.kurylchyk.model;

public abstract class Flower  {

    protected String sort;
    protected String name;


   public  Flower(String sort, String name) {
        this.sort = sort;
        this.name = name;
    }

    public String toString(){

        return sort +"\t" + name;

    }

}

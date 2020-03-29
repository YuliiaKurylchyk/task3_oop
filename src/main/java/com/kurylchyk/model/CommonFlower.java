package com.kurylchyk.model;

public class CommonFlower extends Flower {

    protected String color;

    CommonFlower(String sort,String name,String color){
        super(sort,name);
       this.color = color;
    }

    public String toString(){
        return super.toString()+ "\t" +color;
    }
}

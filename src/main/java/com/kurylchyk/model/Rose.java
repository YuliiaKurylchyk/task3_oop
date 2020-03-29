package com.kurylchyk.model;

public class Rose extends CommonFlower {

    boolean hasPrickle;

   public  Rose(String sort, String name,String color,boolean hasPrickle){
        super(sort,name,color);
        this.hasPrickle = hasPrickle;
    }

    @Override
    public String toString() {
        return super.toString()+ (hasPrickle?" has pickles ": " does not  have pickle ");
    }
}

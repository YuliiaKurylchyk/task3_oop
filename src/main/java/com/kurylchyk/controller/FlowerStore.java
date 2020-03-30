package com.kurylchyk.controller;
import com.kurylchyk.model.*;
import com.kurylchyk.view.PrintView;

import java.util.*;

public class FlowerStore {

    private Map<Flower, Double>  allFlowers = new LinkedHashMap<Flower, Double>();
    private PrintView display = (value)->{
        System.out.println(value); };

    FlowerStore() {
    setAllFlowers();

    }

    private void setAllFlowers(){
        allFlowers.put( new HomeFlower("Yucca","Garden"), 150D);
        allFlowers.put( new HomeFlower("Fern","home"), 180D);
        allFlowers.put( new Rose("Rose","Golden","Red",false), 50D);
        allFlowers.put( new Rose("Rose","Garden","White and Pink",true), 60D);
        allFlowers.put( new Rose("Rose","Sort","Blue",false), 80D);
        allFlowers.put( new Tulip("Tulip","Butterfly","Yellow"), 30D);
        allFlowers.put( new Tulip("Tulip","Butterfly","Purple"), 30D);
        allFlowers.put( new Lilium("Lilium","Garden","White"), 30D);


    }

    public void showAvailableFlowers(){
        int index = 0;
        for(Map.Entry<Flower,Double> value: allFlowers.entrySet()){
            System.out.print(index++ + "\t");
            display.print(value.toString());
        }
    }


    public static void main(String[] args) {
        FlowerStore store = new FlowerStore();
        store.showAvailableFlowers();

    }
}

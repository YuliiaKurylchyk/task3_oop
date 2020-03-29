package com.kurylchyk.controller;
import com.kurylchyk.model.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FlowerStore {

    private Map<Flower, Double>  allFlowers = new LinkedHashMap<Flower, Double>();

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
        for(Map.Entry<Flower,Double> value: allFlowers.entrySet()){
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        FlowerStore store = new FlowerStore();
        store.showAvailableFlowers();
    }
}

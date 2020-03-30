package com.kurylchyk.model;

import java.util.Scanner;

public class Pot {

   private enum Shape {
        ROUND,
        SQUARE,
        STEEP
    }

  private  enum Color {
        GREEN,
        RED,
        WHITE,
        BLACK
    }

    private Color color;
    private Shape shape;
    private  Scanner sc;

    public Pot(){
        setShape();
        setColor();
    }
   private void setShape(){
       sc = new Scanner(System.in);
        for(Shape s: Shape.values()) {
            System.out.println(s);
        }
        System.out.println("Choose the shape: ");
        String answer = sc.nextLine();
        shape  = Shape.valueOf(answer.toUpperCase());
    }

  private  void setColor(){
        sc = new Scanner(System.in);
        for(Color c: Color.values()) {
            System.out.println(c);
        }
        System.out.println("Choose the color: ");
        String answer = sc.nextLine();
        color  = Color.valueOf(answer.toUpperCase());
    }

    public String toString(){
        return shape + " " + color + " pot ";
    }
}

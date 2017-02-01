package com.java.training;

/**
 * Created by 22arsh on 1/25/17.
 */
public abstract class animal {
private int legs;
private String color;
    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getColor() {
        return color;
    }

    public animal(int legs1,String color1)
    {
        this.legs = legs1;
        this.color = color1;
    }
    public animal()
    {}


    public void setColor(String color) {
        this.color = color;
    }

    public abstract void runningspeed();



}

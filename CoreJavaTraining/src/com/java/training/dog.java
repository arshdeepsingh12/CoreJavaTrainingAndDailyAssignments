package com.java.training;

/**
 * Created by 22arsh on 1/25/17.
 */
public class dog extends animal {

    private boolean isbark;

    public boolean isIsbark() {
        return isbark;
    }

    public void setIsbark(boolean isbark) {
        this.isbark = isbark;
    }

    public void runningspeed()
    {
        System.out.println("10KM/hr");
    }


    public dog(int legs1,String color1,boolean bark1)
    {
        super(legs1,color1); // if super is called parent constructor is called
     //this();
        this.isbark  = bark1;
    }

    public dog()
    {                          // default constructor
        super();
    }

}

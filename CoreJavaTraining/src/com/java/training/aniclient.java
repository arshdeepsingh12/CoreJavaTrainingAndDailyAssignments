package com.java.training;

import sun.font.TrueTypeFont;

/**
 * Created by 22arsh on 1/25/17.
 */
public class aniclient {
    public static void main(String[] args) {


    dog d = new dog(12,"black", Boolean.TRUE );
        System.out.println(d.getLegs() + d.getColor() + d.isIsbark() );
        d.runningspeed();

    }
}




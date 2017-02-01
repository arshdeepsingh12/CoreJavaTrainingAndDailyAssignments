package com.java.training;

/**
 * Created by 22arsh on 2/1/17.
 */
public class stackclient {
    private static int x;

    public static void main(String[] args) {
        stack pehla = new stack();
        pehla.setSize(3);

        try{
       //     x=pehla.pop();
        //    System.out.println(x);
            pehla.push(12);
            pehla.push(14);

            pehla.push(15);
            pehla.display();
            pehla.push(18);
        }
        catch(MyException e)
        {
            System.out.println(e);
        }


    }

}


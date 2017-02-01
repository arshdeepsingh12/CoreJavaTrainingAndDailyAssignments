package com.java.training;

/**
 * Created by 22arsh on 1/31/17.
 */
public class reversestring {




    public void reversestr() {

        String s = "abcdef";

        String rev = "";

        int len = s.length();
        for(int i=0;i<len;i++)
        {
            char c =  s.charAt(len-i-1);
          //  System.out.println(c);
             rev = rev + Character.toString(c);
        }

        System.out.println(rev);

    }


    public static void main(String[] args) {

        reversestring obj1 = new reversestring();
        obj1.reversestr();

    }



}

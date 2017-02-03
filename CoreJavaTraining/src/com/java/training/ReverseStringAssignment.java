package com.java.training;

/**
 * Created by 22arsh on 1/31/17.
 */
public class ReverseStringAssignment {

/////////////////////  Using Stack

    public String reverse(String str)
    {

        int len = str.length();
        Stack s = new Stack(len);

       char c[] = str.toCharArray();
;
       for(char c1 : c)
       {s.push(c1);}


       int count=0;


        while(count<=len-1)
        { char t = s.pop();
         //   System.out.println(t);
            c[count++] = t;
        }


       String  str2 = new String (c);
        System.out.println(str2);
        return str2;
    }


//////////// Using normal operations

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

        ReverseStringAssignment obj1 = new ReverseStringAssignment();
        String o = obj1.reverse("abcdef");
        System.out.println(o);
    }

}

package com.java.training;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 22arsh on 2/1/17.
 */
public class StackUsingGenerics<T> {

// how to get methods


    List< T > list = new ArrayList<>();
    int top=-1;
    public  void push(T one) {
        top += 1;
        T hell = one;
        System.out.println("E added to stack and Top is \t" + top);
       System.out.println(one.getClass());
       //   System.out.println(one.getClass().getMethods().toString());
       // System.out.println((T)one.getClass());
        list.add(one);
    }

    public T pop() throws MyExc
    {
        if (top>=0){
            System.out.println(" E removed  & now Top is " + (top-1));
            return (list.get(top--));

        }
        else
        {
            throw new MyExc("underflow");
        }
    }


    public void display()
    {
        int temp=top;
        System.out.println("Displaying all companies");
       // for ( ;temp>=0;  ) {
          //  list.get(top).getClass();
          //  System.out.println(list.get(temp).getName() + "\t\t & ID is \t" + list.get(temp--).getId());
      //  }
    }


    public static void main(String[] args) {

        StackUsingGenerics one = new StackUsingGenerics();

//        List<Company> comp  = new ArrayList<>();
        Company obj1= new Company(12,"Name");
        //comp.add(obj1);
        Company obj2= new Company(13,"Name2");
        //comp.add(obj2);
      //  one.(list);
        Company obj3= new Company(14,"Name3");

        try {
            one.push(obj1);
            one.push(obj2);
            // String c = one.pop();
         //   System.out.println("Removed Company is " + c);
            one.push(obj3);
          //  one.display();
            Object obj = (Company) one.pop();

            //System.out.println("Removed Company is " + one.pop());
            //System.out.println("Removed Company is " + one.pop());
            one.pop();

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}


class MyExc extends Exception{
    public MyExc(String msg)
    {
        super(msg);
    }
}
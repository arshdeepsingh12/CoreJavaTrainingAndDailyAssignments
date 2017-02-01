package com.java.training;

/**
 * Created by 22arsh on 2/1/17.
 */

public class stack {

    private int size;
    static int top=-1;
    Integer[] i1;
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
        i1 = new Integer[size];
    }

    public  void push(int one) throws MyException
    {
        if(top ==size-1)
        {
            throw new MyException("full ");
        }
        else
        {
            top+=1;
            i1[top]=one;

        }
    }

    public int pop() throws MyException
    {
        if(top <=-1)
        {

            throw new MyException("empty");
            //  System.out.println("empty");
            // return 0;
        }
        else
        {
            top-=1;
            return i1[top+1] ;
        }
    }


    public void display()
    {
        for(int j=0;j<=top;j++)
        {
            System.out.println(i1[j]);
        }
    }

}


class MyException extends Exception {
    public MyException(String msg){
        super(msg);
    }
}


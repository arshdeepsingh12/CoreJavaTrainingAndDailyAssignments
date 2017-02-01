package com.java.training;

/**
 * Created by 22arsh on 2/1/17.
 */
public class linked_list {

    class node{
        int x;
        node point;
    }

    node first=null , top=null ,temp;
    public void createnode(int one)
    {
        node xyz = new node();
        if(first == null)
        {
            first = xyz;
        }
        else
        {
            temp.point=xyz;

        }
        xyz.x=one;
        temp=xyz;
        xyz.point =null;
    }
    public void deletenode()
    {
        if(first == null)
        {
            System.out.println("empty");
        }
        else
        {
            first=first.point;

        }
    }

    public void display()
    {
        temp = first;
        while(temp!=null)
        {
            System.out.println(temp.x);
            temp=temp.point;
        }
    }

}


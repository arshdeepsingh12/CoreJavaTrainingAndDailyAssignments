package com.java.training;

/**
 * Created by 22arsh on 2/1/17.
 */

class Node {
    int x;
    Node point = null;
}



public class Linked_List {

    Node first=null  ,temp;
    public void createnode(int one)
    {
        Node xyz = new Node();
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

    public int countnodes(){
        int count=0;
        temp=first;
        while((temp)!=null)
        {
            count++;
            temp=temp.point;
        }
        return count;
    }

    public void insertatpos(int pos,int value)
    {
        int count=0;
        temp=first;
        while((temp)!=null)
        {
            count++;
            temp=temp.point;
        }

        Node xyz = new Node();
        if(pos<=0 || pos>count)
        {
            System.out.println("Position doesn't exist");
        }

        else
        {
            if(first == null  )
            {
                System.out.println("empty");
            }
            else
            {
                temp = first;
                 count = 1;
                while (count < pos - 1) {
                    count++;
                    temp = temp.point;
                }

                Node new1 = new Node();
                new1.point = temp.point;
                temp.point = new1;
                new1.x = value;


            }

        }

    }


    public int findmiddle()
    {
        int x = countnodes();
        if(first==null)
        {
            System.out.println("EMpty");
        }
        else
        {
        if(x%2==0)
        {
            int count =0;
            temp=first;
            while (count<(x%2))
            {
                count++;
                temp=temp.point;
            }
            System.out.println("Middle elements are \t" + temp.x + "\t" + temp.point.x);
            return temp.x;
        }
        else
        {
            int count =0;
            temp=first;
            while (count<(x%2))
            {
                count++;
                temp=temp.point;
            }
            System.out.println("Middle element is \t" + temp.x);
            return temp.x;
        }
        }
       return 0;
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


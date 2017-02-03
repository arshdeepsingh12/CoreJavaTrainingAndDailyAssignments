package com.java.training;

/**
 * Created by 22arsh on 2/3/17.
 */
public class QueueImpl {

    private Integer[] arr ;

    int front = -1, rear = -1 , size;
    public  QueueImpl(int size)
    {
        arr = new Integer[size];
        this.size = size;
    }

    public  void push(int a) throws MyEx {
        if(rear==size-1)
        {

            throw new MyEx("Overflow");
        }
        else
        {
            if(front==-1)
            {
                front=0;
            }
            rear++;
            arr[rear]=a;
        }
    }

    public int pop() throws MyEx {
        if (front == size-1 || front == -1) {
            throw new MyEx("UnderFlow");
        } else {
            int x = arr[front++];
            return x;
        }
    }

    public void display()
    {
        System.out.println("List is");
      for(int i = front; i<=rear ; i++)
      {
          System.out.println(arr[i]);
      }


    }


    public static void main(String[] args) {

        int size=5;
        QueueImpl q = new QueueImpl(size);

        try{
            q.push(1);
            q.push(2);
            q.push(3);
            System.out.println("Removed element " + q.pop());
            q.push(4);
            q.display();
            q.push(5);
            q.push(6);
            q.push(7);
        }
        catch(MyEx e)
        {
            System.out.println(e);
        }


    }

}

class MyEx extends Exception{
    public MyEx (String msg){
       super(msg);
    }
}
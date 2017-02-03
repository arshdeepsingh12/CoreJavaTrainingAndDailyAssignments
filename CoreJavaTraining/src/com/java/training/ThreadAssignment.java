package com.java.training;

/**
 * Created by 22arsh on 2/1/17.
 */
public class ThreadAssignment {

    public static void main(String[] args) throws InterruptedException {

        //ThreadAssignment tr = new ThreadAssignment();


        Free f = new Free();



        Thread t1 = new Thread(f);


        Expense e = new Expense();



        Thread t2 = new Thread(e);
        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            System.out.println("going in main class");
            for(int i=1;i<=10;i++)
                System.out.println(i);

            System.out.println("main thread has also finished now");

        }  catch (InterruptedException e1) {
            e1.printStackTrace();
        }



    }

}
    class Free implements Runnable {

        /*Thread tr;
       public free(String temp)
       {
        tr = new Thread(this,temp);
        tr.start();
       }

*/

        @Override
        public void run() {
            System.out.println("Printing in free class");
            for (int i = 1; i <= 200; i++) {
                System.out.println(i);
            }

        }
    }


    class Expense implements Runnable {

        //Thread tr;
        /*public expense(String temp)
        {
            tr = new Thread(this,temp);
            tr.start();
        }*/
        @Override
        public void run() {

            System.out.println("Printing in expense class");
            for (int i = 1; i <= 20; i++) {
                System.out.println(i);
            }
        }
    }


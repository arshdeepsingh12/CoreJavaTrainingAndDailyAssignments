package com.java.training;

/**
 * Created by 22arsh on 2/1/17.
 */
public class Linked_List_Client {


        public static void main(String[] args) {

            Linked_List pehla = new Linked_List();
            pehla.createnode(12);
            pehla.createnode(10);
            pehla.createnode(102);
            pehla.findmiddle();
            pehla.deletenode();
            pehla.insertatpos(3,10000);
            pehla.insertatpos(2,10000);
            pehla.display();
        }


}

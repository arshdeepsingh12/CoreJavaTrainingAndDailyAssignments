package com.java.training;

/**
 * Created by 22arsh on 2/1/17.
 */
public class linked_list_client {


        public static void main(String[] args) {

            linked_list pehla = new linked_list();
            pehla.createnode(12);
            pehla.createnode(10);
            pehla.createnode(102);

            pehla.deletenode();
            pehla.display();

        }


}

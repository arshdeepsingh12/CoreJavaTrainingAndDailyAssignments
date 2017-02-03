package com.java.training;

import java.util.List;

/**
 * Created by 22arsh on 1/25/17.
 */
public class Employee {
    private int id;
    private String name;

    public Employee(String name,int id)
    {
        this.name=name;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //address home = new address();
    //address office = new address();




}

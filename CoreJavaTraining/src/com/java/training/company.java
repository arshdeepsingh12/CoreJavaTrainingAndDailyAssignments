package com.java.training;

import java.util.List;

/**
 * Created by 22arsh on 1/25/17.
 */
public class Company {
    private String name;
    private int id;
    private List<Dept> departments;



    public Company (int id,String name)
    {

        this.id=id;
        this.name=name;

    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Dept> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Dept> departments) {
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

package com.java.training;

import java.util.List;

/**
 * Created by 22arsh on 1/25/17.
 */
public class project {
    private String name;

    private List<employee> employees;

    public project(String name)
    {
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<employee> employees) {
        this.employees = employees;
    }

}

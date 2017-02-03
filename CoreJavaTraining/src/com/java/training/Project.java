package com.java.training;

import java.util.List;

/**
 * Created by 22arsh on 1/25/17.
 */
public class Project {
    private String name;

    private List<Employee> employees;

    public Project(String name)
    {
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

}

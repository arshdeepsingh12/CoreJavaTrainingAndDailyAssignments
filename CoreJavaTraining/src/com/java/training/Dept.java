package com.java.training;

import java.util.List;

/**
 * Created by 22arsh on 1/25/17.
 */
public class Dept {
    private String name;
    private List<Project> projects;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Dept(String name)
    {
        this.name = name;

    }
}

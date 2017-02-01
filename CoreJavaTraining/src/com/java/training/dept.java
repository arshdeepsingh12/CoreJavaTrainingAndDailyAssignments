package com.java.training;

import java.util.List;

/**
 * Created by 22arsh on 1/25/17.
 */
public class dept {
    private String name;
    private List<project> projects;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<project> getProjects() {
        return projects;
    }

    public void setProjects(List<project> projects) {
        this.projects = projects;
    }

    public dept(String name)
    {
        this.name = name;

    }
}

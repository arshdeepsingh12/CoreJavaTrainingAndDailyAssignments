package com.java.training;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 22arsh on 1/31/17.
 */
public class empclient {
    public static void main(String[] args) {

        List<company> cmp = new ArrayList<>();
        company comp1 = new company(1, "ABS");
        cmp.add(comp1);
        List<dept> depts = new ArrayList<>();
        dept dept1 = new dept("hr");
        dept dept2 = new dept("engg");
        depts.add(dept1);
        depts.add(dept2);
        comp1.setDepartments(depts);
        List<project> prjt = new ArrayList<>();
        project prjt1 = new project("vas1");
        project prjt2 = new project("vas2");
        prjt.add(prjt1);
        prjt.add(prjt2);
        dept1.setProjects(prjt);
        List<project> prjt11 = new ArrayList<>();
        project prjt111 = new project("vas11");
        prjt11.add(prjt111);
        dept2.setProjects(prjt11);
        employee emp1=new employee("arsh",7);

        employee emp2=new employee("arshdeep",8);
        List<employee> emp = new ArrayList<>();
        emp.add(emp1);
        emp.add(emp2);
        prjt1.setEmployees(emp);


        employee emp11=new employee("deep",9);

        employee emp22=new employee("deepsingh",80);
        List<employee> empj = new ArrayList<>();
        empj.add(emp11);
        empj.add(emp22);
        prjt2.setEmployees(empj);


        employee employ=new employee("deep",9);
        List<employee> gre = new ArrayList<>();
        gre.add(employ);
        prjt111.setEmployees(gre);



        System.out.println("Companies :");
        for (company fir : cmp )
        {
            System.out.println(fir.getId() + "\t\t" + fir.getName() );
            for(dept firi : fir.getDepartments())
            {
                System.out.println("Dept of " + fir.getName()  );
                System.out.println(firi.getName());
                for (project pj : firi.getProjects())
                       {

                           System.out.println("Projects of " + firi.getName());
                           System.out.println(pj.getName());
                           //System.out.println();
                       }

            }
        }

    }

}

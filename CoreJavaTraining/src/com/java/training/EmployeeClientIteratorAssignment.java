package com.java.training;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by 22arsh on 1/31/17.
 */
public class EmployeeClientIteratorAssignment {
    public static void main(String[] args) {

        List<Company> cmp = new ArrayList<>();
        Company comp1 = new Company(1, "ABS");
        cmp.add(comp1);
        List<Dept> depts = new ArrayList<>();
        Dept dept1 = new Dept("hr");
        Dept dept2 = new Dept("engg");
        depts.add(dept1);
        depts.add(dept2);
        comp1.setDepartments(depts);
        List<Project> prjt = new ArrayList<>();
        Project prjt1 = new Project("vas1");
        Project prjt2 = new Project("vas2");
        prjt.add(prjt1);
        prjt.add(prjt2);
        dept1.setProjects(prjt);
        List<Project> prjt11 = new ArrayList<>();
        Project prjt111 = new Project("vas11");
        prjt11.add(prjt111);
        dept2.setProjects(prjt11);
        Employee emp1=new Employee("arsh",7);

        Employee emp2=new Employee("arshdeep",8);
        List<Employee> emp = new ArrayList<>();
        emp.add(emp1);
        emp.add(emp2);
        prjt1.setEmployees(emp);


        Employee emp11=new Employee("deep",9);

        Employee emp22=new Employee("deepsingh",80);
        List<Employee> empj = new ArrayList<>();
        empj.add(emp11);
        empj.add(emp22);
        prjt2.setEmployees(empj);


        Employee employ=new Employee("deep",9);
        List<Employee> gre = new ArrayList<>();
        gre.add(employ);
        prjt111.setEmployees(gre);


/*
        System.out.println("Companies :");
        for (Company fir : cmp ) {
            System.out.println(fir.getId() + "\t\t" + fir.getName());
        }
        System.out.println("Departments :");
        for(dept firi : depts) {
            System.out.println( firi.getName());
        }
        System.out.println("Projects :");
        for(Project p : prjt)
        {
            System.out.println(p.getName());
        }
  */

            /////////////////////////iterations using different loops

            System.out.println("Companies :");
            for (Company fir : cmp ) {
                System.out.println("Company is " + "\t\t" + fir.getId() + "\t\t" + fir.getName());
                List<Dept> dr = new ArrayList<>();
                dr = fir.getDepartments();
                Iterator<Dept> depy = dr.iterator();
                while(depy.hasNext()) {
                    Dept ll = depy.next();
                    System.out.println("Department of" + "\t\t" + fir.getName() + "\t\t" + "is" +  "\t\t" + ll.getName());
                    List<Project> pp = new ArrayList<>();
                    pp = ll.getProjects();
                    int i=0;
                    while(i<pp.size()) {
                        System.out.println("Projects of " + "\t\t" + ll.getName() +"\t\t" + "is" +"\t\t" + pp.get(i).getName());

                        List<Employee> ee = new ArrayList<>();
                        ee = pp.get(i).getEmployees();

                        for (int j=0;j<ee.size();j++){
                            Employee ee1 = ee.get(j);
                            System.out.println("Employee of " + "\t\t" + pp.get(i).getName() + "\t\t" + "is" + "\t\t" +ee1.getName() + "\t\t" +ee1.getId());
                            //System.out.println();
                        }
                        i++;
                    }
                }
            }


    }

}

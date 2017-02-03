package com.java.training;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by 22arsh on 1/31/17.
 */
 class IOAssignment {

    public static void main(String[] args) throws Exception{
        //File f1 = new File(  , "file1.txt");
        File dir = new File("/Users/22arsh/assignments/Corejavatraining/CoreJavaTraining/files");
        if(!dir.exists())
        {
            dir.mkdir();
        }

        File f1 = new File(dir,"file1.txt");
        f1.createNewFile();



            FileWriter fw=new FileWriter(f1);
        BufferedWriter bw = new BufferedWriter(fw);
            bw.write("line1\n");
        bw.write("line2\n");
        //bw.write("line3\n");
        bw.write("line4\n");

        fw.flush();
        bw.flush();
        fw.close();
        bw.close();


        File f2 = new File(dir,"copy.txt");
        f2.createNewFile();

        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw2=new FileWriter(f2);
        BufferedWriter bw2 = new BufferedWriter(fw2);


       // int x=0;
//int c=0;
        int c = br.read();
        while(c!=-1)
        {
            bw2.write((char)c);
            c = br.read();
        }

        bw2.flush();
        fw2.flush();
        bw2.close();
        fw2.close();
        fr.close();
        br.close();
        //while (br.read() != -1)
       // {
         //   System.out.println(br.read());

           // bw2.write(br.read());

       // }









    }


}
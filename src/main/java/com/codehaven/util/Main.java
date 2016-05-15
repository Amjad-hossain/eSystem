package com.codehaven.util;

import java.io.*;

/**
 * Created by coder on 3/11/16.
 */
public class Main {

    public static void main(String[] args) {

        int i = 0;
     /*   while(i<11) {

            System.out.println("$table->string('c0"+ ++i +"');");
        }*/

        /*i = 0;
        while(i<34) {

            System.out.println("$table->string('e"+ ++i +"');");
        }*/
/*
        i = 0;
        while(i<33) {

            System.out.print(",'e"+ ++i +"'");
        }
        */
        /*i = 0;
        while(i<11) {

            System.out.print(",'c0"+ ++i +"'");
        }*/
/*
        i = 0;
        while(i<33) {

            System.out.println("ALTER TABLE house_hold_activities ADD f"+ ++i+" varchar(255);");
        }
        */
        i = 0;
        while(i<15) {

            System.out.println("'m0"+ ++i +"'=> $request->input('m0"+ i +"'),");
        }

       /* String[] command = {"/bin/bash", "-c", "git clone https://amjad-hossain-di:amjadict07@github.com/Dynamic-Solution-Innovators/hiring-app.git ~/Desktop/hiring-app"};
        Process p = null;
        try {
            p = Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            System.out.println("--connection error");
            e.printStackTrace();
        }
        try {
            print(p.getInputStream());
        } catch (IOException e) {
            System.out.println("--out pur not found");
            e.printStackTrace();
        }
        System.out.println("--- process done");*/
    }

    public static void print(InputStream inputStream) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(inputStream));
        String line = "";
        while ((line=buf.readLine())!=null) {
            System.out.println(line);
        }
        buf.close();
    }
}

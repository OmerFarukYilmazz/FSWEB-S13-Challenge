package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String [] developers =  {"OMER", "FARUK" , "YILMAZ"};
        Company company = new Company(1,"Amazon", 10000000, new String[10]); // new String[]{"Omer", "Faruk" , "Yılmaz"}
        company.setDeveloperNames(developers);
        company.addEmployee(5,"OSMAN");
        System.out.println(Arrays.toString(company.getDeveloperNames()));
        //company.addEmployee(4);

        
    }
}
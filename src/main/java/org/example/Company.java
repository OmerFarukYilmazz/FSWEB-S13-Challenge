package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = giro < 0 ? 0 : giro;
        this.developerNames = developerNames;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        this.giro = giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        for(int i = 0; i < developerNames.length ; i++){
            if(i < this.developerNames.length){
                this.developerNames[i] = developerNames[i];
            }
        }
    }

    public void addEmployee(int index, String name){
        if(index < 0 || index > developerNames.length){
            System.out.println("Index is out of the length of the array" + developerNames.length + "," + index );
            return;
        }
        if(developerNames[index] == null){
            developerNames[index] = name;
        }
        else{
            System.out.println("Index is full. There is already an employee.");
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}

package com.company;

public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Designation: " + designation;
    }

    public void learn() {
        System.out.println("Learning");
    }

    public void walk() {
        System.out.println("Walking ");
    }

    public void eat() { System.out.println("Eating");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}

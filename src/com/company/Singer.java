package com.company;

public class Singer extends Person{
    String bandName;

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" + "Designation: " + getDesignation() + "\n" + "Band name: " + bandName;
    }

    public void singing() {
        System.out.println("Singing");
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
}

package com.company;

public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" + "Designation: " + getDesignation() + "\n" + "Band name: " + bandName;
    }

    public void singing() {
        System.out.println("Singing");
    }

    public void playGitar() { System.out.println("Play gitar");}

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
}

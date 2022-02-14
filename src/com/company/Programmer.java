package com.company;

public class Programmer extends Person{
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Name:  " + getName() + "\n" + "Designation: " + getDesignation()+ "\n" +
                "Company name: " + companyName;
    }


    public void coding() {
        System.out.println("Coding");
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}

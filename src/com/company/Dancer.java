package com.company;

public class Dancer extends Person {
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" + "Designation: " + getDesignation() + "\n" +
                "Group name: " + groupName;
    }

    public void dancing() {
        System.out.println("Dancing");
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }



}

package com.company;

public class Dancer extends Person {
    private String groupName;

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

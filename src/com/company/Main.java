package com.company;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Ulan", "Football player");
        System.out.println(person);
        person.eat();
        person.walk();
        person.learn();
        System.out.println("\n\n");


        Programmer programmer = new Programmer("Adilet", "Programmer", "Facebook");
        System.out.println(programmer);
        programmer.eat();
        programmer.walk();
        programmer.learn();
        programmer.coding();
        System.out.println("\n\n");


        Dancer dancer = new Dancer("Bakyt", "Dancer", "SuperCrew");
        System.out.println(dancer);
        dancer.eat();
        dancer.walk();
        dancer.learn();
        dancer.dancing();
        System.out.println("\n\n");


        Singer singer = new Singer("Mirbek", "Singer", "Black star");
        System.out.println(singer);
        singer.eat();
        singer.walk();
        singer.learn();
        singer.singing();
        singer.playGitar();

    }
}







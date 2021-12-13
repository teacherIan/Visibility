package com.mainFolder;

import com.example.Person;

public class Main {


    public static void main(String[] args) {

        Person doug = new Person(50,"Doug");
        Person caitlin = new Person(40,"Caitlin");
        Person bob = new Person(70);

        System.out.println(bob);
        bob.setName("Sally");
        System.out.println(bob.getName());



    }
}

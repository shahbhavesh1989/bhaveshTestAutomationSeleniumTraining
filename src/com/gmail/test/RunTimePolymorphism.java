package com.gmail.test;

class Bike {void run() {System.out.println("running Bike");}}

class Honda extends Bike { // void run() {System.out.println("running Honda");}
}

// b obj will find the run() method in Honda class, as it is commented, it will search for same method in parent class Bike at runtime.
public class RunTimePolymorphism {

    public static void main(String args[]) {
    // Created a reference variable 'b' of parent class Bike and instantiated with an object of child class Honda.
        Bike b = new Honda();
        b.run();
    }
}
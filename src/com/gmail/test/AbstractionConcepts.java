package com.gmail.test;

// Creating an interface with two methods.
// By default all methods inside interface are abstract irrespective of 'abstract' keyword usage.
public interface AbstractionConcepts { void m1(); void m2(); }

// Multiple inheritance is possible in java only because of interface.

// Class test is implementing interface AbstractionConcepts and hence this class has to implement all the abstract methods of interface.
// As class has to implement all methods of interface this concept helps to achieve 100% abstraction in java.
class test implements AbstractionConcepts {

    @Override public void m1() {System.out.println("hello from m1 method");}
    @Override public void m2() {System.out.println("hello from m2 method");}
    public void m3() {System.out.println("hello from m3 method");}

    public static void main (String[] args) {
        System.out.println("hello from main() class");

        // Creating reference variable 'a' of AbstractionConcepts interface which will point to object of test class.
        // The reference variable 'a' can access the methods which are present inside interface but implemented by test class.
        AbstractionConcepts a = new test();
        a.m1();
        a.m2();


        // Creating reference variable 't' of test class which will point to object of test class.
        // The reference variable 't' can access the methods which are present inside interface implemented by
        // test class and also the methods which are created by test class itself.
        test t = new test();
        t.m1();
        t.m2();
        t.m3();
    }
}
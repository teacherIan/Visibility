package com.aFolder;

public class A {

    //most visible
    public int publicIntClassA = 1;

    //protected
    protected int protectedIntClassA = 5;

    //package private
    int packagePrivateClassA = 10;

    //private
    private int privateIntClassA = 20;

    static int counter = 0;

    public A() {
        counter++;

    }

}

package com.aFolder;

public class instanceOfA {


    public static void main(String[] args) {


        A a = new A();

        System.out.println(a.publicIntClassA);
        System.out.println(a.packagePrivateClassA);
        System.out.println(a.protectedIntClassA);

        System.out.println("I now have " + A.counter + " As");
    }
}

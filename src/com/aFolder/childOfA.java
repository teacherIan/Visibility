package com.aFolder;

public class childOfA extends A{

    public static void main(String[] args) {
        A aa = new A();

        //because childOfA is a child of the A class,
        //we have visibility of the protected variables
        System.out.println(aa.protectedIntClassA);


        System.out.println(aa.packagePrivateClassA);
        System.out.println(aa.publicIntClassA);
    }
}

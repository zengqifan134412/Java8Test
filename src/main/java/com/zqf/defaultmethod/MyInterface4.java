package com.zqf.defaultmethod;

public interface MyInterface4 extends MyInterface3{

    @Override
    default void myMethod() {
        System.out.println("MyInterface4 myMethod");
    }

}

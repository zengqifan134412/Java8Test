package com.zqf.defaultmethod;

public interface MyInterface2 {

    default void myMethod() {
        System.out.println("MyInterface2 myMethod");
    }

}

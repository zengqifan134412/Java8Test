package com.zqf.defaultmethod;

public interface MyInterface {

    default void myMethod() {
        System.out.println("MyInterface myMethod");
    }

}

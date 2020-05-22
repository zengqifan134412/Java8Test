package com.zqf.defaultmethod;

public interface MyInterface3 {

    default void myMethod() {
        System.out.println("MyInterface3 myMethod");
    }

}

package com.zqf.defaultmethod;

public class MyClass implements MyInterface, MyInterface2{

    @Override
    public void myMethod() {
        System.out.println("MyClass myMethod");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        myClass.myMethod();
    }

}

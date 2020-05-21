package com.zqf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test4 {

    public static void main(String[] args) {

//        MyInterface3 myInterface3 = () -> {};
//        System.out.println(myInterface3.getClass().getInterfaces()[0]);
//
//
//        MyInterface4 myInterface4 = () -> {};
//        System.out.println(myInterface4.getClass().getInterfaces()[0]);

        List<String> list = Arrays.asList("hello", "world", "hello world");

//        list.forEach( (s) -> System.out.println(s.toUpperCase()));

        List<String> list1 = new ArrayList<>();

//        list.stream().map((item) -> item.toUpperCase()).forEach(item -> System.out.println(item));

        list.stream().map(String::toUpperCase).forEach(item -> System.out.println(item));
    }

}

@FunctionalInterface
interface MyInterface3 {

    void myInterface3Test();

}


@FunctionalInterface
interface MyInterface4 {

    void myInterface4Test();

}



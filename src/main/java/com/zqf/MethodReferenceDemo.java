package com.zqf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "hello world", "hello Java");

//        list.forEach(str -> System.out.println(str));

        list.forEach(System.out::println);
    }

}

package com.zqf.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest9 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello world", "wordl hello", "hello world hello", "hello welcome");

//        list.stream().map(s -> s.split(" ")).distinct().forEach(System.out::println);

        list.stream().flatMap(s -> Arrays.stream(s.split(" "))).distinct().forEach(System.out::println);
    }

}

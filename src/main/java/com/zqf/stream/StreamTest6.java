package com.zqf.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamTest6 {

    public static void main(String[] args) {
//        List<String> list = Arrays.asList("hello", "wordl", "hello world");

//        list.stream().map(i -> i.substring(0).toUpperCase() + i.substring(1).toUpperCase());

//        IntStream.iterate(0, i -> (i + 1) % 2).limit(6).distinct().forEach(System.out::println);

        IntStream.iterate(0, i -> (i + 1) % 2).distinct().limit(6).forEach(System.out::println);
    }

}

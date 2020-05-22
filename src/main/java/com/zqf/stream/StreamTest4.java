package com.zqf.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest4 {

    public static void main(String[] args) {
//        List<String> list = Arrays.asList("hello", "world", "hellworld", "test");

//        list.forEach(value -> System.out.println(value.toUpperCase()));

//        list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);

//        System.out.println("------------------------");

//        list.forEach(System.out::println);


//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
//
//        list.stream().map(value -> value * value).collect(Collectors.toList()).forEach(System.out::println);

        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1), Arrays.asList(2), Arrays.asList(3), Arrays.asList(4));

        stream.flatMap(thisList -> thisList.stream()).map(value -> value * value).forEach(System.out::println);


    }

}

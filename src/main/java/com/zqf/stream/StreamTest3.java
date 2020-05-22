package com.zqf.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest3 {

    public static void main(String[] args) {
//        Stream<String> stream = Stream.of("hello", "hello world", "hello Java");

//        String[] strings = stream.toArray(length -> new String[length]);
//        String[] strings = stream.toArray(String[]::new);
//        Arrays.asList(strings).forEach(System.out::println);

        Stream<String> stream = Stream.of("hello", "hello world", "hello Java");

//        List<String> list = stream.collect(Collectors.toList());
//        List<String> list = stream.collect(() -> new ArrayList<String>(), (thisList, item) -> thisList.add(item), (left, right) -> left.addAll(right));
        List<String> list = stream.collect(LinkedList::new, LinkedList::add, LinkedList::addAll);
        list.forEach(System.out::println);

    }
}
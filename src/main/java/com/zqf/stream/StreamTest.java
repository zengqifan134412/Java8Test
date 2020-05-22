package com.zqf.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        Stream stream = Stream.of("hello");
        stream.forEach(System.out::println);

        int[] arrays = {1, 2, 3, 4, 5};
        IntStream stream1 = Arrays.stream(arrays);

        List<String> list = Arrays.asList("hello", "hello world", "hello java");
        list.stream();
    }

}

package com.zqf.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest10 {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("hi", "hello" ,"nihao");
        List<String> list2 = Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu");

        List<String> collect = list1.stream().flatMap(v -> list2.stream().map(v2 -> v + "  " + v2)).collect(Collectors.toList());

        collect.forEach(System.out::println);

    }

}

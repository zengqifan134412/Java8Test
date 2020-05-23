package com.zqf.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest8 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello1", "world1", "helloworld5");

//        list.stream().mapToInt(v -> v.length()).filter(v -> v == 5).findFirst().ifPresent(System.out::println);

        list.stream().mapToInt(v -> {
            int len = v.length();
            System.out.println(v);
            return len;
        }).filter((v -> v == 5)).findFirst().ifPresent(System.out::println);

    }

}

package com.zqf.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        Integer reduce = list.stream().map(value -> value * 2).reduce(0, Integer::sum);

        System.out.println(reduce);

    }

}

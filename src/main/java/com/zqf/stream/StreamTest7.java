package com.zqf.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StreamTest7 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(5000000);

        for (int i = 0; i < 5000000; i ++) {
            list.add(UUID.randomUUID().toString());
        }

        System.out.println("开始排序");

//        long start = System.nanoTime();
        long start = System.currentTimeMillis();

        list.parallelStream().sorted().count();

        long end = System.currentTimeMillis();

        System.out.println("排序时间 " + (end - start));
    }

}

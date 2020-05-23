package com.zqf.stream;

import java.util.IntSummaryStatistics;
import java.util.UUID;
import java.util.stream.Stream;

public class StreamTest5 {

    public static void main(String[] args) {
//        Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
//
//        System.out.println(stream.findFirst());

//        Stream.iterate(1, value -> value + 2).forEach(System.out::println);

//        Stream.iterate(1, value -> value * (value + 1)).limit(6).forEach(System.out::println);

//        System.out.println(Stream.iterate(1, value -> value + 2).limit(6).filter(value -> value > 2).mapToInt(value -> value * 2).skip(2).limit(2).sum());

//        System.out.println(Stream.iterate(1, value -> value + 2).limit(6).filter(value -> value > 200).mapToInt(value -> value * 2).skip(2).limit(2).min());

//        Stream.iterate(1, value -> value + 2).limit(6).filter(value -> value > 200).mapToInt(value -> value * 2).skip(2).limit(2).max().ifPresent(System.out::println);

        Stream<Integer> stream = Stream.iterate(1, value -> value +2).limit(6);

//        IntSummaryStatistics intSummaryStatistics = stream.filter(value -> value > 200).mapToInt(value -> value * 2).skip(2).limit(2).summaryStatistics();
//
//        System.out.println(intSummaryStatistics.getMin());
//        System.out.println(intSummaryStatistics.getMax());
//        System.out.println(intSummaryStatistics.getCount());
//        System.out.println(intSummaryStatistics.getAverage());
//        System.out.println(intSummaryStatistics.getSum());

        System.out.println(stream);
        System.out.println(stream.filter(value -> value > 2));
        System.out.println(stream.distinct());
    }

}

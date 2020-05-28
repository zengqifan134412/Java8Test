package com.zqf.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest11 {

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 100, 20);
        Student student2 = new Student("lisi", 90, 20);
        Student student3 = new Student("wangwu", 90, 30);
        Student student4 = new Student("zhangsan", 80, 40);
        Student student5 = new Student("wangwu", 90, 50);

        List<Student> list = Arrays.asList(student1, student2, student3, student4, student5);

//        Map<String, List<Student>> collect = list.stream().collect(Collectors.groupingBy(Student::getName));

//        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));

//        Map<String, Double> collect = lisst.stream().collect(Collectors.groupingBy(Student::getName, Collectors.averagingDouble(Student::getScore)));

//        Map<Boolean, List<Student>> collect = list.stream().collect(Collectors.partitioningBy(student -> student.getScore() >= 90));
//        System.out.println(collect);

//        list.stream().collect(Collectors.minBy((v1,v2) -> v1.getScore() - v2.getScore())).ifPresent(System.out::println);

        list.stream().collect(Collectors.maxBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);

        System.out.println(list.stream().collect(Collectors.averagingInt(Student::getScore)));

        System.out.println(list.stream().collect(Collectors.summarizingInt(Student::getScore)));

        System.out.println("---------------------------------------------------");

        System.out.println(list.stream().map((v) -> v.getName()).collect(Collectors.joining(",", "start,", ",end")));

        System.out.println("---------------------------------------------------------");

        Map<Integer, Map<String, List<Student>>> map = list.stream().collect(Collectors.groupingBy(Student::getScore, Collectors.groupingBy(Student::getName)));

        System.out.println(map);

        System.out.println("-----------------");

//        list.stream().collect(Collectors.partitioningBy((Student s) -> s.getScore() > 80), Collectors.partitioningBy(s -> s.getScore() > 90));
    }

}

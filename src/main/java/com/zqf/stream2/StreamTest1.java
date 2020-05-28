package com.zqf.stream2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest1 {

    public static void main(String[] args) {

        Student student1 = new Student("zhangsan", 30);
        Student student2 = new Student("lisi", 40);
        Student student3 = new Student("wangwu", 50);
        Student student4 = new Student("zhangliu", 60);

        List<Student> students = Arrays.asList(student1, student2, student3, student4);

        System.out.println(students.stream().collect(Collectors.counting()));

    }

}

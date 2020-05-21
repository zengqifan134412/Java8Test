package com.zqf.mthodreference;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MthodReferenceTest {

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 10);
        Student student2 = new Student("lisi", 90);
        Student student3 = new Student("wangwu", 50);
        Student student4 = new Student("zhaoliu", 60);

        List<Student> students = Arrays.asList(student1, student2, student3 ,student4);

//        students.sort((studentParam1, studentParam2) -> Student.compareStudentByScore(studentParam1, studentParam2));
//        students.forEach((value) -> System.out.println(value));


        System.out.println("---------------------------------");

//        students.sort(Student::compareStudentByScore);
//        students.forEach((value) -> System.out.println(value));

//        Comparator<Student> comparator = Student::compareStudentByScore;

//        System.out.println(comparator.getClass());// class com.zqf.mthodreference.MthodReferenceTest$$Lambda$1/1747585824
//        System.out.println(comparator.getClass().getInterfaces()[0]);// interface java.util.Comparator

        Comparator<Student> comparator = (value1, value2) -> value1.getScore() - value2.getScore();

        System.out.println(comparator.getClass());
        System.out.println(comparator.getClass().getInterfaces()[0]);
    }

}

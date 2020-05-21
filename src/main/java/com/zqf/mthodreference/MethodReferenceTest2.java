package com.zqf.mthodreference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest2 {

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 10);
        Student student2 = new Student("lisi", 90);
        Student student3 = new Student("wangwu", 50);
        Student student4 = new Student("zhaoliu", 60);

        List<Student> students = Arrays.asList(student1, student2, student3 ,student4);

//        students.sort((studentParam1, studentParam2) -> new StudentComparator().compareStudentByScore(studentParam1, studentParam2));
//        students.forEach((value) -> System.out.println(value));
//        students.forEach(System.out::println);

//        StudentComparator studentComparator = new StudentComparator();

//        students.sort(studentComparator::compareStudentByScore);

//        students.sort(Student::compareByScore);
//        students.forEach(System.out::println);

        List<String> cities = Arrays.asList("beijing", "tianjing", "shanghai", "chongqing");

//        Collections.sort(cities, (value1, value2) -> value1.compareToIgnoreCase(value2));
        Collections.sort(cities, String::compareToIgnoreCase);
        cities.forEach(System.out::println);


    }

}

package com.zqf.mthodreference;

public class Student {

    private String name;

    private Integer score;

    public Student(String name, Integer score) {
        this.score = score;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public static int compareStudentByScore(Student student1, Student student2) {
        return student1.getScore() - student2.getScore();
    }

    public static int compareStudentByname(Student student1, Student student2) {
        return student1.getName().compareToIgnoreCase(student1.getName());
    }

    public int compareByScore(Student student1) {
        return this.score - student1.score;
    }

    public int compareByName(Student student1) {
        return this.name.compareToIgnoreCase(student1.name);
    }
}

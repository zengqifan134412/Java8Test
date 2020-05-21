package com.zqf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PersonTest {

    public static void main(String[] args) {
        Person person = new Person("zhangsan", 12);
        Person person1 = new Person("lisi", 13);
        Person person2 = new Person("wangwu", 14);

        List<Person> list = Arrays.asList(person, person1 ,person2);

        List<Person> personByAge = getPersonByAge(12, list);

        personByAge.forEach((personn) -> System.out.println(personn));
    }

    public static List<Person> getPersonByAge(int age, List<Person> persons) {
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (ageOfPerson, personList) -> {
            return personList.stream().filter((person) -> person.getAge() > ageOfPerson).collect(Collectors.toList());
        };

        return biFunction.apply(age, persons);
    }

}

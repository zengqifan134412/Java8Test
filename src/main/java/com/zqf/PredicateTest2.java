package com.zqf;

import java.io.BufferedOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest2 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        PredicateTest2 predicateTest2 = new PredicateTest2();

//        predicateTest2.conditionFilter(list, (value) -> value % 2 == 0);
//
//        predicateTest2.conditionFilter(list, (value) -> value % 2 != 0);
//
//        predicateTest2.conditionFilter(list, (value) -> value > 5);
//
//        predicateTest2.conditionFilter(list, (value) -> true);

        predicateTest2.conditionFilter2(list, value -> value > 5, value -> value % 2 == 0);
    }

    public void conditionFilter(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer integer : list) {
            if (predicate.test(integer)) {
                System.out.print(integer + "  ");
            }
        }
        System.out.println();
    }

    public void conditionFilter2(List<Integer> list, Predicate<Integer> predicate, Predicate<Integer> predicate2) {
        for (Integer integer : list) {
            if (predicate.and(predicate2).test(integer)) {
                System.out.print(integer + "  ");
            }
        }
        System.out.println();
    }

}

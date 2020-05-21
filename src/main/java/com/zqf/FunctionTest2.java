package com.zqf;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest2 {

    public static void main(String[] args) {
//        Function<Integer, Integer> function= v -> v * 2;
//
//
//        Function<Integer, Integer> function1 = v -> v + 4;
//
////        Integer apply = function.compose(function1).apply(2);// 12
//        Integer apply = function.andThen(function1).apply(2);// 8
//        System.out.println(apply);


//        System.out.println(compute(1, 2, (value1, value2) -> value1 + value2));
//        System.out.println(compute(1, 2, (value1, value2) -> value1 - value2));
//        System.out.println(compute(1, 2, (value1, value2) -> value1 * value2));
//        System.out.println(compute(1, 2, (value1, value2) -> value1 / value2));

        BiFunction<Integer, Integer, Integer> biFunction = (value1, value2) -> value1 + value2;

        Integer apply = biFunction.andThen((Integer value2) -> value2 * 2).apply(2, 4);// 12

        System.out.println(apply);

    }

    public static Integer compute(int a, int b, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(a , b);
    }

}

package com.zqf.interfacetest;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {
        int compute = FunctionTest.compute(1, (value) -> value * 2);

        System.out.println(compute);
    }

    private static int compute(int a, Function<Integer, Integer> function) {
        int result = function.apply(a);
        return result;
    }

}

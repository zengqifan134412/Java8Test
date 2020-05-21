package com.zqf;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

    public static void main(String[] args) {
        BinaryOperatorTest binaryOperatorTest = new BinaryOperatorTest();

        System.out.println(binaryOperatorTest.getShort("hello", "helloworld", (value1, value2) -> value1.length() - value2.length()));

        System.out.println(binaryOperatorTest.getShort("hello", "helloworld", (value1, value2) -> value1.charAt(0) - value2.charAt(0)));

    }

    public String getShort(String s1, String s2, Comparator<String> comparator) {
        return BinaryOperator.minBy(comparator).apply(s1, s2);
    }

}

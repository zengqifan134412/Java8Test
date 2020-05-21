package com.zqf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test2 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer + "  ");
            }
        });

        System.out.println("==============================");


        list.forEach( (i) -> {
            System.out.println(i);
        });

    }

}

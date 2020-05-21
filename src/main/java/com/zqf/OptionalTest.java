package com.zqf;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        Optional<String> optionalS = Optional.of("hello world");

//        if (optionalS.isPresent()) {
//            System.out.println(optionalS.get());
//        }

        optionalS.ifPresent((value) -> System.out.println(value));
    }


}

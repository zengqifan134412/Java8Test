package com.zqf;

import java.util.function.*;

public class SupplierTest {

    public static void main(String[] args) {
        Supplier supplier = () -> "hello world";

        System.out.println(supplier.get());
    }

}

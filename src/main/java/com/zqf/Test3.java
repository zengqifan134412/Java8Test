package com.zqf;

@FunctionalInterface
interface MyInterface2 {
    void show();

    String toString();
}

public class Test3 {

    private static void test(MyInterface2 myInterface2) {
        myInterface2.show();
    }

    public static void main(String[] args) {
//        test(new MyInterface2() {
//            @Override
//            public void show() {
//                System.out.println("show");
//            }
//        });

//        test( () -> {
//            System.out.println("show");
//        });

        MyInterface2 myInterface2 = () -> {
            System.out.println("show2");
        };

        System.out.println(myInterface2.getClass());
        System.out.println(myInterface2.getClass().getSuperclass());
        System.out.println(myInterface2.getClass().getInterfaces()[0]);
    }

}

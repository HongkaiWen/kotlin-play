package com.github.hongkaiwen.kotlinplay.step1;

public class Entry {

    public static void main(String[] args) {
        int r = UtilsKt.add(1, 2);
        System.out.println(r);

        Student.INSTANCE.hello("小唐");

        Utils.hei(null);
    }


    public static String in = "in";

}

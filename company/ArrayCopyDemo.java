package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        String[] str = {"1", "2", "3", "4"};
        String[] str1 = Arrays.copyOf(str, str.length + 1);

        System.out.println(Arrays.toString(str));
        System.out.println();
        Object o = new Object(); //all the objects in java inherit methods of the class Object

    }
}

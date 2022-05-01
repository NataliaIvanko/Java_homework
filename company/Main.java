package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	ArrayGetter arrayGetter = new ArrayGetter();
    System.out.println(Arrays.toString(arrayGetter.getArray(5, new RandomArray())));
    System.out.println(Arrays.toString(arrayGetter.getArray(5, new ArrayFromScanner())));


    }
}

package com.company;

import java.util.Random;

public class RandomArray implements FillingInArray {
    public int[] getNewArray(int size) {
        int[] res = new int[size];
        int min = 0;
        int max = 100;
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < size; i++) {
            res[i] = (int) (Math.random() * (max - min + 1) + min);

        }
        return res;
    }



}

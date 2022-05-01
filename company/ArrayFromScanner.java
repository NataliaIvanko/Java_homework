package com.company;

import java.util.Scanner;

public class ArrayFromScanner implements FillingInArray{


    public int[] getNewArray(int size) {
        int[] arr = new int[size];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + i);
           int element = scanner.nextInt();
           arr[i] = element;

        }
        scanner.close();
        return arr;
    }
}

package com.company;

import java.util.Comparator;

public class StudentsComparatorByGPA implements Comparator<Students> {

    @Override
    public int compare (Students s1, Students s2) {
        if (s1.getGpa()< s2.getGpa()) return -1;
        if (s1.getGpa()> s2.getGpa()) return 1;
        return 0;
    }
}


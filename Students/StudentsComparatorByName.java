package com.company;

import java.util.Comparator;

public class StudentsComparatorByName implements Comparator<Students> {
    @Override
    public int compare (Students s1, Students s2){
        return s1.getName().compareTo(s2.getName());

    }
}

package com.company;

import java.util.Comparator;

public class StudentsComparatorByAge implements Comparator<Students> {
    @Override
    public int compare (Students s1, Students s2){
        return s1.getYearOfBirth()-s2.getYearOfBirth();
}

}

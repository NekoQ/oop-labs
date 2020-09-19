package com.company.lab2;

import java.util.ArrayList;
import java.util.List;

public class University {
    String name;
    int foundationYear;
    List<Student> students = new ArrayList<>();

    float marksAverage(){
        float avrg = 0;
        for (Student s : students){
            avrg += s.mark;
        }
        avrg /= students.size();
        return avrg;
    }
}

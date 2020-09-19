package com.company.lab2;


import static java.lang.StrictMath.abs;
import static java.util.concurrent.ThreadLocalRandom.*;

public class Main {

    public static void main(String[] args) {
        University[] universities = new University[3];

        for (int i = 0; i < 3; i++) {
            universities[i] = new University();

            for (int j = 0; j < 3; j++) {
                universities[i].students.add(new Student(abs(current().nextInt() % 10 + 1)));
                System.out.println(universities[i].students.get(j).mark);
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("University " + (i+1) + " average mark: " + universities[i].marksAverage());
        }
    }



}

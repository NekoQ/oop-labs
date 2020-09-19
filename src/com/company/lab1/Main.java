package com.company.lab1;


public class Main {

    public static void main(String[] args) {
        Monitor m1 = new Monitor();
        Monitor m2 = new Monitor();

        m1.color = "red";
        m1.height = 800;
        m1.width = 600;
        m1.res_x = 400;
        m1.res_y = 300;

        m2.color = "blue";
        m2.height = 800;
        m2.width = 400;
        m2.res_x = 800;
        m2.res_y = 600;

        m1.compare(m2);
        System.out.println();
    }
}

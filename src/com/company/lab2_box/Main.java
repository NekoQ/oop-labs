package com.company.lab2_box;

public class Main {
    public static void main(String[] args) {

        Box box1 = new Box();

        Box box2 = new Box(2);

        Box box3 = new Box(1, 2, 3);

        System.out.println(box1.surfArea() + "  " + box1.volume());
        System.out.println(box2.surfArea() + "  " + box2.volume());
        System.out.println(box3.surfArea() + "  " + box3.volume());
    }
}

package com.company.lab1;


public class Monitor {
    String color;
    int height, width;
    int res_x, res_y;

    void compare(Monitor m) {
        if (height * width > m.height * m.width)
            System.out.printf("The first monitor is bigger\n");
        if (res_x * res_y < m.res_x * m.res_y)
            System.out.printf("The second monitor has a bigger resolution\n");
    }
}

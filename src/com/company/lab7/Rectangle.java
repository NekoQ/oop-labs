package com.company.lab7;

public class Rectangle extends  Figure{
    private float a;
    private float b;

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }
    @Override
    float getArea() {
        return a * b;
    }

    @Override
    float getPerimeter() {
        return 2 * (a + b);
    }

}

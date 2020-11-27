package com.company.lab7;

public class Square extends Figure{
    private float a;

    public Square(float a) {
        this.a = a;
    }
   @Override
    float getArea() {
        return a * a;
    }

   @Override
    float getPerimeter() {
        return 4 * a;
    }
}

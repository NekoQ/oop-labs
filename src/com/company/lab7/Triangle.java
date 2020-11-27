package com.company.lab7;

public class Triangle extends Figure{
    private float a;
    private float b;
    private float c;

    Triangle (float a, float b, float c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    float getArea() {
        float p, s;
        p = (a+b+c)/2;
        s = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }

    @Override
    float getPerimeter() {
        return a + b + c;
    }

}

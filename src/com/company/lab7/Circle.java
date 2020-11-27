package com.company.lab7;

public class Circle extends Figure{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }
    @Override
    float getArea() {
        return (float) (Math.PI * radius);
    }

    @Override
    float getPerimeter() {
        return (float) (2 * Math.PI * radius);
    }
}
package com.company.lab8;

public class Parallelepiped implements GeometricBody{
    float a, b, c;

    Parallelepiped(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getSurface() {
        return 2 * (a*b + a*c + b*c);
    }

    public float getVolume() {
        return a * b * c;
    }
}

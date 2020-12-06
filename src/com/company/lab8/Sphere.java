package com.company.lab8;

public class Sphere implements GeometricBody{
    float r;

    Sphere(float r) {
        this.r = r;
    }

    public float getSurface() {
        return (float) (4 * Math.PI * r * r);
    }

    public float getVolume() {
        return (float) (4 * Math.PI * r * r * r / 3);
    }
}

package com.company.lab8;

public class Cub implements GeometricBody{
    float l;

    Cub(float l) {
        this.l = l;
    }

    public float getSurface() {
        return 6 * l * l;
    }

    public float getVolume() {
        return l * l * l;
    }
}

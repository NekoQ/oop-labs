package com.company.lab8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cub cube = new Cub(5);
        Sphere sphere = new Sphere(3);
        Parallelepiped p = new Parallelepiped(5, 6, 5);

        List<GeometricBody> arr = new ArrayList<>();
        arr.add(cube);
        arr.add(sphere);
        arr.add(p);

        System.out.println("Biggest volume " + GeometricBodyController.getBiggestVolume(arr).getVolume());
        System.out.println("Biggest surface " + GeometricBodyController.getBiggestSurface(arr).getSurface());
    }
}

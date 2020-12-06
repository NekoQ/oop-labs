package com.company.lab8;

import java.util.List;

public class GeometricBodyController {

    static GeometricBody getBiggestVolume(List<? extends GeometricBody> arr) {
        GeometricBody maxBody = arr.get(0);
        float max = -1;
        for (GeometricBody a : arr) {
            if (a.getVolume() > max) {
                max = a.getVolume();
                maxBody = a;
            }
        }
        return maxBody;
    }

    static GeometricBody getBiggestSurface(List<? extends GeometricBody> arr) {
        GeometricBody maxBody = arr.get(0);
        float max = -1;
        for (GeometricBody a : arr) {
            if (a.getSurface() > max) {
                max = a.getSurface();
                maxBody = a;
            }
        }
        return maxBody;
    }
}

package com.skvortsov;

import java.util.Comparator;

public class EngineCapacityComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        if (car1.getEngineCapacity() == car2.getEngineCapacity()) {
            return 0;
        } else if (car1.getEngineCapacity() > car2.getEngineCapacity()) {
            return 1;
        } else return -1;
    }
}
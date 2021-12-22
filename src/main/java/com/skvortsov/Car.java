package com.skvortsov;

public class Car implements Comparable<Car> {
    private int yearOfManufacture;
    private int engineCapacity;

    public Car(int year, int capacity) {
        this.yearOfManufacture = year;
        this.engineCapacity = capacity;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public int compareTo(Car car) {
        if (this.yearOfManufacture == car.getYearOfManufacture()) {
            return 0;
        } else if (this.yearOfManufacture > car.getYearOfManufacture()) {
            return 1;
        } else return -1;
    }

    @Override
    public String toString() {
        return "Car " + "yearOfManufacture is " + yearOfManufacture + ", engineCapacity is " + engineCapacity;
    }
}
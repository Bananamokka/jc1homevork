package com.bananamokka.Lesson2HW;

import java.util.Comparator;

public class Car implements RunInterface, Comparator {

    public static int count = 10;

    private String carMark;

    private String carModel;

    private int doors;

    private double engineVolume;

    private int yearOfCreation;

    private String bodyType;

    private double wheelDiameter;

    public Car() {

    }

    public Car(String carMark, String carModel, int doors, double engineVolume, int yearOfCreation, String bodyType, double wheelDiameter) {
        this.carMark = carMark;
        this.carModel = carModel;
        this.doors = doors;
        this.engineVolume = engineVolume;
        this.yearOfCreation = yearOfCreation;
        this.bodyType = bodyType;
        this.wheelDiameter = wheelDiameter;
    }

    public Car(String carMark, String carModel) {
        this.carMark = carMark;
        this.carModel = carModel;
    }

    public String getCarMark() {
        return carMark;
    }

    public void setCarMark(String carMark) {
        this.carMark = carMark;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public double getWheelDiameter() {
        return wheelDiameter;
    }

    public void setWheelDiameter(double wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }


    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (doors != car.doors) return false;
        if (Double.compare(car.engineVolume, engineVolume) != 0) return false;
        if (yearOfCreation != car.yearOfCreation) return false;
        if (Double.compare(car.wheelDiameter, wheelDiameter) != 0) return false;
        if (!carMark.equals(car.carMark)) return false;
        if (!carModel.equals(car.carModel)) return false;
        return bodyType.equals(car.bodyType);
    }


    @Override
    public int hashCode() {
        int result;
        long temp;
        result = carMark.hashCode();
        result = 31 * result + carModel.hashCode();
        result = 31 * result + doors;
        temp = Double.doubleToLongBits(engineVolume);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + yearOfCreation;
        result = 31 * result + bodyType.hashCode();
        temp = Double.doubleToLongBits(wheelDiameter);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carMark='" + carMark + '\'' +
                ", carModel='" + carModel + '\'' +
                ", doors=" + doors +
                ", engineVolume=" + engineVolume +
                ", yearOfCreation=" + yearOfCreation +
                ", bodyType='" + bodyType + '\'' +
                ", wheelDiameter=" + wheelDiameter +
                '}';
    }



    @Override
    public void run() {
        System.out.println("Car is running");
    }

    @Override
    public int move() {
        System.out.println("Car is moving for 3 steps");
        return 0;
    }
}




package com.bananamokka.Lesson2HW;

public class GenerateCar implements CarInterface {

    @Override
    public Car generateCarMark() {
        Car car = new Car();
        car.setCarMark(CAR_MARK_1);
        System.out.println("Mark of generated car is " + car.getCarMark());
        return car;
    }
}


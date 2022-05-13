package com.bananamokka.Lesson2HW.Util;

import com.bananamokka.Lesson2HW.Car;
import com.bananamokka.Lesson2HW.CarInterface;
import com.bananamokka.Lesson2HW.GenerateCar;
import com.bananamokka.Lesson2HW.RunInterface;

import java.util.Arrays;

public class CarUtil {

    public static void main(String[] args) {

        Car[] CarArray = new Car[Car.count];
        for (int i = 0; i < CarArray.length; i++) {
            CarArray[i] = new Car();
        }
        Arrays.sort(CarArray);
        System.out.println(Arrays.toString(CarArray));


        GenerateCar gen = new GenerateCar();
        gen.generateCarMark();


        RunInterface Car1 = new Car();
        Car1.run();
        Car1.move();

    }
}



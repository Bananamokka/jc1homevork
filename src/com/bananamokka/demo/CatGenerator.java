package com.bananamokka.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CatGenerator {
    public static List<Cat> generateCats(int objectsCount) {

        List<Cat> cats = new ArrayList<>(objectsCount);

        for (int i = 0; i < objectsCount; i++) {
            //add generate method for different params of object
            cats.add(new Cat());
        }

        return cats;
    }
    public static LinkedList<Cat> generateCats1(int objectsCount1) {

        LinkedList<Cat> cats1 = new LinkedList<>();

        for (int i = 0; i < objectsCount1; i++) {
            //add generate method for different params of object
            cats1.add(new Cat());
        }

        return cats1;
    }
}

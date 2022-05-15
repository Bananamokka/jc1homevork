package com.bananamokka.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        Cat cat = new Cat();

        long start = System.currentTimeMillis();

        List<Cat> cats = new ArrayList<>(100000);
        CatGenerator.generateCats(100000);
        long end = System.currentTimeMillis();
        long result = end - start;

        System.out.println("Array list process: " + result);

        long start1 = System.currentTimeMillis();

        LinkedList<Cat> cats1 = new LinkedList<>();
        CatGenerator.generateCats1(100000);
        long end1 = System.currentTimeMillis();
        long result1 = end - start;

        System.out.println("Linked list process: " + result);

        long start2 = System.currentTimeMillis();

        cats.remove(new Cat());

        long end2 = System.currentTimeMillis();
        long result2 = end - start;
        System.out.println("Remove Array list process: " + result);

        long start3 = System.currentTimeMillis();

        cats1.remove(new Cat());

        long end3 = System.currentTimeMillis();
        long result3 = end - start;
        System.out.println("Remove Linked list process: " + result);

    }
}

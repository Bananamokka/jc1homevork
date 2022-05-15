package com.bananamokka.demo;

import java.util.List;

public class CatUtil {
    public static void printCollection(List<Cat> list) {
        //print all elements of collection
        for (Cat tempCat : list) {
            System.out.println(tempCat);
        }
    }

    public static void printCollectionInfo(List<Cat> list) {
        //print all elements of collection
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}

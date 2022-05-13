package com.bananamokka.demo;

public class TestClass {
    public static void main(String[] args) {
        try {
        /*  Cat[] CatsAr = new Cat[3];
            CatsAr[0].setCatName("Tom");
            CatsAr[1].setCatName("Jack");
            if (CatsAr[0].getCatName() == "Barsik") {
                System.out.println("We found it!");
            }
            else if (CatsAr[1].getCatName() == "Barsik") {
            System.out.println("We found it!");
            }
            else if (CatsAr[2].getCatName() == "Barsik") {
                System.out.println("We found it!");
            }
            else CatsAr[0].someProcess();
            */
           Cat cat = new Cat();
           cat.someProcess();
        } catch (RuntimeException e) {
         throw new RuntimeException(e);
        } //finally {
    }
}

package com.bananamokka.demo;

public class TestClass {
    public static void main(String[] args) {
        try {
          //  Cat[] CatsAr = new Cat[3];
            //CatsAr[0].setCatName("Tom");
            //CatsAr[1].setCatName("Jack");
          /*  switch (CatsAr[0].getCatName()) {
                case "Cat":
                    System.out.println("We found it!");
                    break;
                default:
            */
           Cat cat = new Cat();
           cat.someProcess();
        } catch (RuntimeException e) {
         throw new RuntimeException(e);
        } //finally {
    }
}

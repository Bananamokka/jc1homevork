package com.bananamokka.demo;

public class Cat {

    private String catName;

    public void someProcess() {
        throw new MyCustomException("You're", "fool");
    }


    public Cat() {
        this.catName = catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatName() {
        return catName;
    }

}

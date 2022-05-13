package com.bananamokka.demo;

public class MyCustomException extends RuntimeException{
    String exceptionCode1;
    String exceptionCode2;

    public MyCustomException(String exceptionCode1, String exceptionCode2) {
        this.exceptionCode1 = exceptionCode1;
        this.exceptionCode2 = exceptionCode2;
    }

    public MyCustomException() {

    }
}

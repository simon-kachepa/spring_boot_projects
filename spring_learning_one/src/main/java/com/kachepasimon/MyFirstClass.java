package com.kachepasimon;

public class MyFirstClass {

    private final String myVar;

    public MyFirstClass(String myVar){
        this.myVar = myVar;
    }

    public String greeting() {
        return "Hello World from Simon ==> MyVar = " + myVar;
    }
}

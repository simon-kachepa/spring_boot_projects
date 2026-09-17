package com.kachepasimon.school;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyFirstTest {

    @BeforeEach
    void setUp() {
        System.out.println("Hello, inside BeforeEach");
    }

    @Test
    public void myFirstTest() {
        System.out.println("Hello, inside myFirstTest");
    }

}
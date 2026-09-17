package com.kachepasimon.school;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyFirstTest {

    @BeforeEach
    void setUp() {
        System.out.println("Hello, inside BeforeEach");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Hello, inside AfterEach");
    }

    @Test
    public void myFirstTest() {
        System.out.println("Hello, inside myFirstTest");
    }

    @Test
    public void mySecondTest() {
        System.out.println("Hello, inside mySecondTest");
    }

}
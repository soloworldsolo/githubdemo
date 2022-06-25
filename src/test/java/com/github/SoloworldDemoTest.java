package com.github;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoloworldDemoTest {

    private SoloworldDemo soloworldDemo;


    @BeforeEach
    void setUp() {
        soloworldDemo =new SoloworldDemo();
    }

    @Test
    void test() {
        int add = soloworldDemo.add(5, 7);

        assertEquals(add,12);
    }
}
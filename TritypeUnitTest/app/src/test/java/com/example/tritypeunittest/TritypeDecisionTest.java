package com.example.tritypeunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeDecisionTest {
    @Test
    public void testScaleneTriangle() {
        int result = Tritype.Triang(3, 4, 5);
        assertEquals(1, result); // Expecting scalene triangle
    }

    @Test
    public void testIsoscelesTriangle() {
        int result = Tritype.Triang(2, 2, 3);
        assertEquals(2, result); // Expecting isosceles triangle
    }

    @Test
    public void testEquilateralTriangle() {
        int result = Tritype.Triang(2, 2, 2);
        assertEquals(3, result); // Expecting equilateral triangle
    }

    @Test
    public void testNotATriangle() {
        int result = Tritype.Triang(1, 2, 3);
        assertEquals(4, result); // Expecting not a triangle
    }
}
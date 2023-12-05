package com.example.tritypeunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeConditionTest {
    @Test
    public void testSide1EqualsSide2() {
        int result = Tritype.Triang(2, 2, 3);
        assertEquals(2, result); // Expecting isosceles triangle
    }

    @Test
    public void testSide1EqualsSide3() {
        int result = Tritype.Triang(2, 3, 2);
        assertEquals(2, result); // Expecting isosceles triangle
    }

    @Test
    public void testSide2EqualsSide3() {
        int result = Tritype.Triang(3, 2, 2);
        assertEquals(2, result); // Expecting isosceles triangle
    }

    @Test
    public void testNoEqualSides() {
        int result = Tritype.Triang(3, 4, 5);
        assertEquals(1, result); // Expecting scalene triangle
    }
}
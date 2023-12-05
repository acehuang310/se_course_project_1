package com.example.tritypeunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeLineBranchTest {
    @Test
    public void testScaleneTriangle() {
        int result = Tritype.Triang(3, 4, 5);
        assertEquals(1, result);
    }

    @Test
    public void testIsoscelesTriangle() {
        int result = Tritype.Triang(3, 3, 4);
        assertEquals(2, result);
    }

    @Test
    public void testEquilateralTriangle() {
        int result = Tritype.Triang(2, 2, 2);
        assertEquals(3, result);
    }

    @Test
    public void testNotATriangle() {
        int result = Tritype.Triang(1, 2, 3);
        assertEquals(4, result);
    }

    @Test
    public void testZeroSide() {
        int result = Tritype.Triang(0, 4, 5);
        assertEquals(4, result);
    }

    @Test
    public void testNegativeSide() {
        int result = Tritype.Triang(-1, 4, 5);
        assertEquals(4, result);
    }

    @Test
    public void testIllegalTriangle() {
        int result = Tritype.Triang(1, 2, 4);
        assertEquals(4, result);
    }

    @Test
    public void testIllegalTriangle2() {
        int result = Tritype.Triang(5, 1, 2);
        assertEquals(4, result);
    }

    @Test
    public void testIllegalTriangle3() {
        int result = Tritype.Triang(2, 5, 1);
        assertEquals(4, result);
    }
}
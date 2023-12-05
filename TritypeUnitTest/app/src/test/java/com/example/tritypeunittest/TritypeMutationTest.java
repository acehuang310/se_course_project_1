package com.example.tritypeunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMutationTest {
    @Test
    public void killMutantOneTest() {
        TritypeMutantOne tri = new TritypeMutantOne();
        /*
         * Test failed.
         * Expected: 4, Founded: 2.
         */
        assertEquals(4, tri.Triang(2,2,5));
    }
    @Test
    public void killMutantTwoTest() {
        TritypeMutantTwo tri = new TritypeMutantTwo();
        /*
         * Test failed.
         * Expected: 4, Founded: 2.
         */
        assertEquals(4, tri.Triang(4,4,8));
    }
}
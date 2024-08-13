package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void sortColorsTest() {
        Solution solution = new Solution();
        int[] inputOne = new int[]{2,0,2,1,1,0};
        solution.sortColors(inputOne);
        assertArrayEquals(new int[]{0,0,1,1,2,2}, inputOne);
        int[] inputTwo = new int[]{2,0,1};
        solution.sortColors(inputTwo);
        assertArrayEquals(new int[]{0,1,2}, inputTwo);
        int[] inputThree = new int[]{2,2,2,2,2,2,0,0,1,1,0,0};
        solution.sortColors(inputThree);
        assertArrayEquals(new int[]{0,0,0,0,1,1,2,2,2,2,2,2}, inputThree);
    }

}
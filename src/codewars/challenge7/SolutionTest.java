package codewars.challenge7;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {
	   
    @Test
    public void exampleTest1() {
        assertArrayEquals(new int[]{ 1, 3, 2, 8, 5, 4 }, Kata.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
    }
    
    @Test
    public void exampleTest2() {
        assertArrayEquals(new int[]{ 1, 3, 5, 8, 0 }, Kata.sortArray(new int[]{ 5, 3, 1, 8, 0 }));
    }
    
    @Test
    public void exampleTest3() {
        assertArrayEquals(new int[]{}, Kata.sortArray(new int[]{}));
    }
    
    @Test
    public void testIsOdd() {
    	assertTrue(Kata.isOdd(3));
    	assertFalse(Kata.isOdd(2));
    	assertFalse(Kata.isOdd(0));
    }
}

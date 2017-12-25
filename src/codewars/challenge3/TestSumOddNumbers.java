package codewars.challenge3;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSumOddNumbers {
	private int[] triangle = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29}; 

	private static void testing(int row, int sum) {
        assertEquals(SumOddNumbers.rowSumOddNumber(row), sum );
    }
	@Test
	public void test() {
		testing(1, 1);
	}

}

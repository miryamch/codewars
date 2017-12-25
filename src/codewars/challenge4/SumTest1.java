package codewars.challenge4;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest1 {
	Sum s = new Sum();

	@Test
	public void testBasic()
	{
		assertEquals(1, s.GetSum(0, 1));
	}
	
	@Test
	public void testUnordered()
	{
		assertEquals(-1, s.GetSum(0, -1));
	}

	@Test
	public void testPositiveRange()
	{
		assertEquals(55, s.GetSum(0, 10));
	}
	
	@Test
	public void testPositive()
	{
		assertEquals(15, s.GetSum(0, 5));
	}
	
	@Test
	public void testNegative()
	{
		assertEquals(-15, s.GetSum(-5, -1));
	}

	@Test
	public void testSwitchMinMax()
	{
		assertEquals(-15, s.GetSum(-1, -5));
	}
}

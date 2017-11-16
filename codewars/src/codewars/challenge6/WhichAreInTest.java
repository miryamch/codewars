package codewars.challenge6;

import static org.junit.Assert.*;

import org.junit.Test;

public class WhichAreInTest {

	@Test
	public void testSorted() {
		String a[] = new String[]{ "arp", "live", "strong" };
    	String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
    	String r[] = new String[] { "arp", "live", "strong" };
		assertArrayEquals(r, WhichAreIn.inArray(a, b));
	}
	
	@Test
	public void testUnSorted() {
		String a[] = new String[]{ "strong", "arp", "live" };
    	String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
    	String r[] = new String[] { "arp", "live", "strong" };
		assertArrayEquals(r, WhichAreIn.inArray(a, b));
	}

}

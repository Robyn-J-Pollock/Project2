import static org.junit.Assert.*;

import org.junit.Test;

public class MesoInheritTest {

	@Test
	public void calAverageTest() {
		MesoInherit inherit = new MesoInherit(new MesoStation("AAAA"));
		//A = 65
		int[] results = inherit.calAverage();
		for (int x : results)
			assertEquals(65, x);
		/*
		 * A = 65, B = 66, C = 67, D = 68
		 * (65+66+67+68)/4 = 66.5
		 */
		inherit = new MesoInherit(new MesoStation ("ABCD"));
		results = inherit.calAverage();
		assertEquals(66, results[0]);
		assertEquals(67, results[1]);
		assertEquals(67, results[2]);
		
		/*
		 * A = 65, B = 66
		 * (65*3 + 66)/4 = 65.25
		 */
		inherit = new MesoInherit(new MesoStation ("AAAB"));
		results = inherit.calAverage();
		assertEquals(65, results[0]);
		assertEquals(66, results[1]);
		assertEquals(65, results[2]);
	}
	
	@Test
	public void letterAverageTest()
	{
		MesoInherit inherit = new MesoInherit(new MesoStation("AAAA"));
		assertEquals('A', inherit.letterAverage());
	}

}

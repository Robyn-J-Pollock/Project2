import static org.junit.Assert.*;

import org.junit.Test;

public class MesoStationTest {

	@Test
	public void constructorTest(){
		MesoStation station = new MesoStation("ABCD");
		char[] expected = {'A', 'B', 'C', 'D'};
		assertEquals("ABCD", station.getStID());
		assertArrayEquals(expected, station.getSplitStId());
	}

}

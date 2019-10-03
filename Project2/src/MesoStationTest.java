import static org.junit.Assert.*;

import org.junit.Test;

public class MesoStationTest {

	@Test
	public void constructorTest(){
		MesoStation station = new MesoStation("ABCD");
		assertEquals("ABCD", station.getStID());
	}

}

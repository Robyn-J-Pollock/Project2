import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

public class PosAvgTest {

	@Test
	public void indexOfStationTest() {
		try {
			PosAvg testPosAvg = new PosAvg("ALTU");
			assertEquals(6, testPosAvg.indexOfStation());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void toStringTest() {
		try {
			PosAvg testPosAvg = new PosAvg("ALTU");
			String expected = "This index is average of ADAX and ALV2, ACME and ANT2, and so on.\n";
			assertEquals(expected, testPosAvg);
		}
		catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
}

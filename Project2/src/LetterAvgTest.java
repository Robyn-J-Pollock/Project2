import static org.junit.Assert.*;

import org.junit.Test;

public class LetterAvgTest {

	@Test
	public void numberOfStationsWithLetterAverageTest()
	{
		try {
			LetterAvg testLetterAverage = new LetterAvg('M');
			assertEquals(13, testLetterAverage.numberOfStationWithLetterAvg());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void toStringTest()
	{
		try {
			LetterAvg testLetterAverage = new LetterAvg('M');
			testLetterAverage.numberOfStationWithLetterAvg();
			String expected = "They are:\nSTID\nCLOU\nEVAX\nEVAX\nHINT\nHUGO\nINOL\nKENT\nNEWK\nNOWA\nPAUL\nPERK\nSHAW\nWASH\n";
			assertEquals(expected, testLetterAverage);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}

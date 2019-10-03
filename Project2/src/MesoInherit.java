/**
 * @author Robyn Pollock
 * @version 2019-10-3
*/
public class MesoInherit extends MesoAbstract {
	
	private MesoStation station;
	
	/*
	 * Creates a new MesoInherit object, stores new MesoStation.
	 */
	public MesoInherit(MesoStation station)
	{
		
	}
	
	/*
	 * Stores the ASCII average of the station,
	 * with [0] being the floor,
	 * [1] being the ceiling,
	 * and [2] being the average.
	 * i.e. an average of 78.3 give [0] = 78, [1] = 79, [2] = 78
	 */
	@Override
	public int[] calAverage() {
		return null;
	}
	
	/*
	 * Provides the character for the ASCII average from calAverage.
	 */
	@Override
	public char letterAverage() {
		return 0;
	}
}

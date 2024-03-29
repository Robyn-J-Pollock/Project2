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
		this.station = station;
	}
	
	/*
	 * Stores the ASCII average of the station,
	 * with [0] being the ceiling,
	 * [1] being the floor,
	 * and [2] being the average.
	 * i.e. an average of 78.3 give [0] = 78, [1] = 79, [2] = 78
	 */
	@Override
	public int[] calAverage() {
		char[] charArray = station.getStID().toCharArray();;
		double dAvg = 0;
		for (char x : charArray)
			dAvg += Integer.valueOf(x);
		dAvg = dAvg/4.0;
		int intAvg = (int) dAvg;
		int[] intArray = new int[3];
		intArray[1] = intAvg;
		if (dAvg/intAvg > 1)
		{
			intArray[0] = intAvg + 1;
			if (dAvg - intAvg >= 0.5)
				intArray[2] = intAvg + 1;
			else
				intArray[2] = intAvg;
		}
		else 
		{
			intArray[0] = intAvg;
			intArray[2] = intAvg;
		}
		return intArray;
	}
	
	/*
	 * Provides the character for the ASCII average from calAverage.
	 */
	@Override
	public char letterAverage() {
		return (char) calAverage()[2];
	}
}
